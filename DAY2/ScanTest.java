
// package DAY2;
import java.util.*;
import java.util.regex.*;

public class ScanTest {

    static HashMap<String, String> patterns = new HashMap<>();
    static {
        patterns.put("name", "^[A-Za-z ]{3,}$");
        patterns.put("password","^(?=.[@#$!_])[A-Za-z0-9?=.@#$!_]{8,}$");
        patterns.put("aadhar","^[0-9]{12}$");
        patterns.put("pan","^[A-Z]{5}[0-9]{4}[A-Z]{1}$");
        patterns.put("email","^[a-z0-9-_]{2,}@[a-z]{3,}\\.[a-z]{2,}$");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full name:");
        String fullName = sc.next();

        System.out.println("Enter password");
        String password = sc.nextLine();

        System.out.println("Enter PAN");
        String panNumber = sc.next();

        System.out.println("Enter the aadhar Number");
        long aadhar = sc.nextLong();

        System.out.println("Enter the email");
        String email = sc.next();

        sc.close();
    }
}
