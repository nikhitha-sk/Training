import java.util.*;

public class sortColors {

    public static void main(String[] args) {
        int[] nums = { 2, 0, 1, 0, 2, 0, 1 };
        int count0 = 0;
        int count1 = 0;
        // int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                count0++;
            if (nums[i] == 1)
                count1++;
            // if (nums[i] == 2)
            //     count2++;
        }
        for(int i=0; i<nums.length; i++){
            if(count0 > 0){
                nums[i] =0;
                count0--;
            }else if(count1 > 0){
                nums[i] = 1;
                count1--;
            }else{
                nums[i] = 2;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
