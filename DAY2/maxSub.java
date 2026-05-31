// package DAY2;

public class maxSub {

    public static int sum(int[] nums) {
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            curSum = Math.max(nums[i], curSum + nums[i]);
            maxSum = Math.max(curSum, maxSum); 
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 4, -1, 7, 8 };
        System.out.println(sum(nums));
    }
}
