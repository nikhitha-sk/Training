import java.util.*;

public class missingPositive {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        int[] nums = {-1,1,2,4,5};

        for(int n : nums){
            set.add(n);
        }

        for(int i = 1;;i++){
            if(!set.contains(i)) {
                System.out.println(i);
                break;
            }
        }     
    }
}
