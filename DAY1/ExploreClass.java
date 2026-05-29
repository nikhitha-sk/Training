package DAY1;
import java.util.*;

public class ExploreClass {
    public static void main(String[] args){
        String key = args[0];
        System.out.println(findValue(args,key,1));

    }

    public static int findValue(String[] args, String key,int index){
        if(index >= args.length)return -1;
        if(args[index].equals(key))
            return index;
        else  return findValue(args,key,index+1);

    }
    // public static void main(Integer[] args){

    // }
    // public static void main(double args){

    // }
}
