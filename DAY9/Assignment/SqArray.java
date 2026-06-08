// package Assignment;
import java.util.*;
public class SqArray {
    public static void main(String[] args){

        int[] nums = {-4,-1,0,3,10};
        int n = nums.length;
        int[]res = new int[n];

        int l=0, r= n-1 , i=n-1;

        while(l <= r){
            int lsq = nums[l] *nums[l];
            int rsq = nums[r] * nums[r];

            if(lsq > rsq){
                res[i] = lsq;
                l++;
            }else{
                res[i] = rsq;
                r--;
            }
            i--;
        }
        System.out.println(Arrays.toString(res));
    }
}
