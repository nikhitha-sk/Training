// package DAY7;
import java.util.*;

public class JewelsStones {

    public static int stones(String jw , String st){
        HashSet<Character> set = new HashSet<>();
        int count =0 ;
        
        for(char c : jw.toCharArray()){
            set.add(c);
        }

        for( char s : st.toCharArray()){
            if(set.contains(s)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        String s1 = "aA" , s2 = "aAAbbb";
        System.out.println(stones(s1,s2));
    }
}
