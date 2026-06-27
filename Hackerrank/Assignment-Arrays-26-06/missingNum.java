import java.util.Scanner;

public class missingNum {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0; i<n-1; i++){
            nums[i] = sc.nextInt();
        }

        int actualSum = 0;

        for(int i=0; i<n-1; i++){
            actualSum += nums[i];
        }

        int expectedSum = n * (n+1)/2;
        System.out.println(expectedSum - actualSum);
    }
}
