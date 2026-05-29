// package Assignment1;
import java.util.*;
public class thirdMax {
    
    public static int max(int[] nums){
        Arrays.sort(nums);
        int count = 1;
        int third = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {

            if (nums[i] != nums[i + 1]) {
                count++;

                if (count == 3) {
                    return nums[i];
                }
            }
        }

        return nums[nums.length - 1];
    }

    public static void main(String[] args){
        int[] nums = {3,2,1};
        System.out.println(max(nums));
    }
}
