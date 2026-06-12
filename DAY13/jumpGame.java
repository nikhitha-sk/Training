public class jumpGame { 

    public static boolean jump(int[] nums){
        int maxLen = 0 , i=0 , size = nums.length;
        while( i < size ){
            if(i > maxLen) return false;
            maxLen = Math.max(maxLen,i + nums[i]);
            i++;
        }
        return true;
    }

    public static void main(String[] args){
        int[] nums = {2,3,1,1,4};
        System.out.println(jump(nums));
    }
}
