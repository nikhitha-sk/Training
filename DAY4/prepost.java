
// package DAY4;
import java.util.*;

public class prepost {

    public static int[] recurPre(int[] nums) {
        int[] prefix = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            prefix[i] = sum;
        }
        return prefix;
    }

    public static int[] recurPost(int[] nums) {
        int[] postfix = new int[nums.length];
        int sum = 0;
        for (int i=nums.length-1; i>=0; i--) {
            sum += nums[i];
            postfix[i] = sum;
        }
        return postfix;
    }

    public static void main(String[] args) {
        int[] nums = { 23, 35, 133, 178, 196, 241, 253, 351 };
        System.out.println(Arrays.toString(recurPre(nums)));
        System.out.println(Arrays.toString(recurPost(nums)));

    }
}
