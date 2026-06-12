public class mostWater {
    public static void main(String[] args){
        int[] nums = {1,8,6,2,5,4,8,3,7};
        int l = 0 , r = nums.length - 1;
        int res = 0;
        
        while( l< r){
            int area = Math.min(nums[l] , nums[r]) * (r-l);
            res = Math.max(area,res);

            if(nums[l] < nums[r]){
                l++;
            }else{
                r--;
            }
        }
        System.out.println(res);
    }
}
