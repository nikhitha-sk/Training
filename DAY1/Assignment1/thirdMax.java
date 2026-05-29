// package Assignment1;
import java.util.*;
public class thirdMax {
    
    public static int max(int[] nums){
        Arrays.sort(nums);
        // System.out.println(nums[nums.length-3]);
        return nums[nums.length-3];
    }

    public static void main(String[] args){
        int[] nums = {3,2,1};
        System.out.println(max(nums));
    }
}
