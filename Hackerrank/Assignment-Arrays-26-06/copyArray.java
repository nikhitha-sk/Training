import java.util.Scanner;

public class copyArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        int[] res = new int[n];

        for(int i=0; i<n; i++){
            res[i] = nums[i];
        }

        for(int x : res){
            System.out.print(x+" ");
        }
        sc.close();
    }
}
