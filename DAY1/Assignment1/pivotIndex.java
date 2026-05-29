// package Assignment1;

public class pivotIndex {
    
    public static int index(int[] nums){
        int total = 0;

        for(int num : nums){
            total += num;
        }

        int lSum = 0;

        for(int i=0; i<nums.length; i++){
            int rSum = total - lSum - nums[i];

            if(rSum == lSum){
                return i;
            }
            lSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args){
        int[] nums = {1,7,3,6,5,6};
        System.out.println(index(nums));
    } 
}
