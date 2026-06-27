import java.util.Scanner;

public class secondLarge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for(int num : nums){
            if(num > large){
                secondLarge = large;
                large = num;
            }else if(num < large && num > secondLarge){
                secondLarge = num;
            }
        }
        System.out.println(secondLarge);
    }
}
