package main.java.customer.jdbc;

import java.sql.*;
import java.util.Scanner;

public class CustomerJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/InsuranceDB";
        String user = "root";
        String password = "1234";

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            // Add Customer
            System.out.print("Enter Customer ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();

            System.out.print("Enter DOB (yyyy-mm-dd): ");
            String dob = sc.nextLine();

            System.out.print("Enter Contact Number: ");
            String contact = sc.nextLine();

            String insertQuery =
                    "INSERT INTO Customer VALUES (?, ?, ?, ?)";

            PreparedStatement pst =
                    con.prepareStatement(insertQuery);

            pst.setString(1, id);
            pst.setString(2, name);
            pst.setDate(3, Date.valueOf(dob));
            pst.setString(4, contact);

            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Customer added successfully.");
            }

            // Fetch customers with same DOB
            System.out.print(
                    "\nEnter DOB to search (yyyy-mm-dd): ");

            String searchDob = sc.nextLine();

            String selectQuery =
                    "SELECT * FROM Customer WHERE DOB = ?";

            PreparedStatement ps =
                    con.prepareStatement(selectQuery);

            ps.setDate(1, Date.valueOf(searchDob));

            ResultSet rs = ps.executeQuery();

            System.out.println("\nMatching Customers:");

            while (rs.next()) {
                System.out.println(
                        rs.getString("CustomerID") + " " +
                        rs.getString("CustomerName") + " " +
                        rs.getDate("DOB") + " " +
                        rs.getString("ContactNo"));
            }

            rs.close();
            pst.close();
            ps.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}