// package DAY1;

import java.util.*;
 class Stock {
    public static void main(String[] args) {
        int[] prices = {0,10,-1,0};
        int prevmin = Integer.MAX_VALUE;
        int res[] = {-1,-1};
        int max = Integer.MIN_VALUE;

        for(int i=0; i<prices.length; i++){
            int profit = prices[i] - prevmin;

            if(profit > max){
                res[0] = prevmin;
                res[1] = prices[i];
                max = profit;
            }
            prevmin = Math.min(prevmin,prices[i]);

        }
        System.out.println(Arrays.toString(res));
    }
}