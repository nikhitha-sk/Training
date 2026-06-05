// package Assignment7;
import java.util.HashMap;

public class majorElement {
    public static int major(int[] nums){
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int n: nums){
            map.put(n , map.getOrDefault(n,0)+1);

        if(map.get(n) > nums.length/2)
            return n;
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println(major(new int[]{3,2,3}));              // 3
        System.out.println(major(new int[]{2,2,1,1,1,2,2}));     // 2
        System.out.println(major(new int[]{1}));                 // 1
    }
} 
