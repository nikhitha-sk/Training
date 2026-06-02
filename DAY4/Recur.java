// package DAY4;

import java.util.Arrays;

public class Recur {
    
    public static void pre(int[] nums, int[] prefix, int i,int sum){
        if(i >= nums.length) return;

        sum += nums[i];
        prefix[i] = sum;
        pre(nums,prefix,i+1,sum);
    }

    public static void post(int[] nums , int[] postfix , int i,int sum){
        if(i < 0) return;

        sum += nums[i];
        postfix[i] = sum;
        post(nums,postfix,i-1,sum);
    }

        public static void main(String[] args) {
        int[] nums = { 23, 35, 133, 178, 196, 241, 253, 351 };

        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];

        pre(nums,prefix,0,0);
        post(nums,postfix,nums.length-1,0);

        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(postfix));

    }
}
