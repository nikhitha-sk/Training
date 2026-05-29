public class two {
    public static void zero(int[] nums){
        int l=0,r=0;
        for(r=0; r<nums.length; r++){
            if(nums[r] != 0){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
        } 
        
    }

    public static void main(String[] args){
        System.out.println(zero(20,10,30,40,0,25,0,10,0,24));
    }
}
