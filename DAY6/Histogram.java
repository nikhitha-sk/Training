// package DAY6;
import java.util.Stack;
public class Histogram {
    public static int maxArea(int[] chart){

        int max = Integer.MIN_VALUE;
        int temp = 0;
    
        Stack<Integer> stk = new Stack<>();
    
        for(int i = 0; i <= chart.length; i++){
            int cVal = (i == chart.length) ? 0 : chart[i];
            
            while(!stk.isEmpty() && cVal < chart[stk.peek()]){
                int len = chart[stk.pop()];
                int brd = stk.isEmpty() ? i : i - stk.peek() - 1;
                temp = len * brd;
                max = Math.max(temp , max);
            }
            stk.push(i);
        }
        return max;
    }

    public static void main(String[] args){
        int[] chart = {2,1,5,6,2,3};
        System.out.println(maxArea(chart));
    }
}
