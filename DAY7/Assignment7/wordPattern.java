// package Assignment7;
import java.util.*;
public class wordPattern {
    
    public boolean wordPattern(String pattern , String s){
        String[] words = s.split(" ");

        if(words.length != pattern.length())
            return false;
        
        Map<Object,Integer> map = new HashMap<>();

        for(int i = 0; i <words.length; i++)
            if(Objects.equals(map.put(pattern.charAt(i),i) , map.put(words[i],i)))
                return false;
        return true;    
    }

    public static void main(String[] args){
        wordPattern wp = new wordPattern();
        
        System.out.println(wp.wordPattern("abba", "redbluebluered"));      // true
        System.out.println(wp.wordPattern("abba", "redbluebluegreen"));    // false
        System.out.println(wp.wordPattern("aaaa", "asdasdasdasd"));        // true
    }
}
