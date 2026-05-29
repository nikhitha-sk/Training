package DAY1;
import java.util.*;

public class Main{
    public static void move(int[] trucks){
        int valid = 0 , i = 0 ,size = trucks.length;
        while(i  <size){
            if(trucks[i] != 0){
                trucks[valid] = trucks[i];
                valid++;
            }
            i++;
        }
        Arrays.fill(trucks, valid,size,0);
        System.out.println(Arrays.toString(trucks));
        
    }

    public static void main(String[] args){
        move(new int[] {20,10,0,1,});
        move(new int[] {3,0,0,1,2});
    }
}