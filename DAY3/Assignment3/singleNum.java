// package Assignment3;

public class singleNum {
    
    public static int single(int[] nums){
        int res = 0;

        for(int n : nums){
            res ^= n;
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums ={2,2,1};
        System.out.println(single(nums));
    }
}
