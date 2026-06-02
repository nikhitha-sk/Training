

public class minEle {
    
    public static void main(String[] args){
        int[] nums = {11,12,13,14};
        // int[ ]nums = {3,4,1,2};

        if(nums[0] < nums[nums.length-1])
            System.out.println(nums[0]);

        for(int i=1; i < nums.length; i++){
            if(nums[i] < nums[i-1]){
                System.out.println(nums[i]);
                break;
            }
        }
    }
}
