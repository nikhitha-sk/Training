import java.io.*;
import java.util.*;

public class Main {

    // POJO Class
    static class Feedback implements Serializable {
        private String trainerName;
        private String batchId;
        private String studentUsn;
        private double rating;
        private String comments;

        public Feedback(String trainerName, String batchId,
                        String studentUsn, double rating, String comments) {
            this.trainerName = trainerName;
            this.batchId = batchId;
            this.studentUsn = studentUsn;
            this.rating = rating;
            this.comments = comments;
        }

        public String getStudentUsn() {
            return studentUsn;
        }

        @Override
        public String toString() {
            return "Trainer Name : " + trainerName +
                   "\nBatch ID     : " + batchId +
                   "\nStudent USN  : " + studentUsn +
                   "\nRating       : " + rating +
                   "\nComments     : " + comments;
        }
    }

    public static void main(String[] args) {

        String fileName = "feedbacks.dat";

        // Create feedback objects
        List<Feedback> feedbackList = new ArrayList<>();

        feedbackList.add(new Feedback(
                "Ravi Kumar",
                "B101",
                "4SF21CS001",
                4.5,
                "Good teaching"));

        feedbackList.add(new Feedback(
                "Anita Rao",
                "B102",
                "4SF21CS002",
                4.8,
                "Very helpful"));

        feedbackList.add(new Feedback(
                "Suresh",
                "B103",
                "4SF21CS003",
                4.2,
                "Nice sessions"));

        // Store list into file
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {

            oos.writeObject(feedbackList);
            System.out.println("Feedbacks stored successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing file.");
        }

        // Read feedback by USN
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Student USN to search: ");
        String usn = sc.nextLine();

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(fileName))) {

            List<Feedback> list = (List<Feedback>) ois.readObject();

            boolean found = false;

            for (Feedback f : list) {
                if (f.getStudentUsn().equalsIgnoreCase(usn)) {
                    System.out.println("\nFeedback Found:");
                    System.out.println(f);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("No feedback found for USN: " + usn);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error while reading file.");
        }

        sc.close();
    }
}