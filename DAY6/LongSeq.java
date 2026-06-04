// package DAY6;
import java.util.*;
public class LongSeq {

    public static int findLen(int[] arr){
        int size  = arr.length , mLength = 1;
        int[] dp  = new int[size];
        dp[0] = 1;
        
        Arrays.fill(dp , 1);
        for(int  i =1; i < size; i++){
            for(int x = 0; x < i; x++){
                if( arr[x]<arr[i])
                    dp[i] = Math.max(dp[i] , dp[x] + 1);
                
            }
            mLength = Math.max(mLength , dp[i]);
        }
        return mLength;
    }
       public static void main(String[] args){
            int[] inp = {0,1,0,3,2,3};
            System.out.println(findLen(inp));
       }
}
