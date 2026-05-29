package DAY1;
import java.util.*;

public class Min {
    public static void main(String[] args){
        int[] nums  ={8,10,3,1,4,2,5};

        HashSet<Integer> set  =new HashSet<>();
        int min = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
            min = Math.min(min,nums[i]);
        }
        while(true){
            if(set.contains(min)){
                min++;
            }else{
                break;
            }
        }
        System.out.println(min);
    }
}
