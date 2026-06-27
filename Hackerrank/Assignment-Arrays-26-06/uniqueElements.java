import java.util.*;

public class uniqueElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0; i <n; i++){
            nums[i] = sc.nextInt();
        }

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int i=0; i<n; i++){
            set.add(nums[i]);
        }

        for(int num : set){
            System.out.print(num+" ");
        }
    }
}
