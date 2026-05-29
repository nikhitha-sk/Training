import java.util.*;

public class sort2 {
    public static int[] sort(int[] nums){
        int low=0, mid=0, high=nums.length-1;
        while(mid <= high){
            if(nums[mid] == 0){
                nums[low] = nums[low] ^ nums[mid];
                nums[mid]  = nums[low] ^ nums[mid];
                nums[low] = nums[low] ^ nums[mid];
                low++;mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }else{
               nums[high] = nums[high] ^ nums[mid];
                nums[mid]  = nums[high] ^ nums[mid];
                nums[high] = nums[high] ^ nums[mid];
                high--;
            }
        }
        return nums;
    }

    // public static void swap(int[] a, int i, int j){
    //     int t = a[i];
    //     a[i] = a[j];
    //     a[j] = t;
    // }
public static void main(String[] args){
    int[] nums = {1,0,0,1,0,2,0,1,2,1,2};
    System.out.println(Arrays.toString(sort(nums)));
}

}
