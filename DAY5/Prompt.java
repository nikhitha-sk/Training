import java.io.IOException;
import java.util.Scanner;

public class Prompt {
    public static void main(String[] args) throws IOException , InterruptedException{
        Scanner sc = new Scanner(System.in);
        Runtime run = Runtime.getRuntime();
        System.out.println("Enter the app");
        String app = sc.next();
        Thread.sleep(1000);
        Process pro = run.exec(app);
    }
}
