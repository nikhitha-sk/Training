// package Assignment1;

import java.util.*;

public class removeDuplicates{

    public static int remove(int[] nums){
        if(nums.length == 0) return 0;

        int i=1;
        for(int j=1; j<nums.length; j++){
            if(nums[j] != nums[i-1]){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args){
        int[] nums = {1, 1, 2, 2, 3, 4, 4};
        int k= remove(nums);

        System.out.println("Number unique elements:" +k);
        System.out.println("Array:");
        for(int i=0; i<k; i++){
            System.out.print(nums[i]+" ");
        }
    }
}