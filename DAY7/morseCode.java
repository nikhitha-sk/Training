import java.util.*;

public class morseCode{
    
    public static void main(String[] args){
        String[] words ={"aba","aab","aba"};
        String[] morse = {"--",".-"};

        HashSet<String> set = new HashSet<>();
        
        for(String word : words ){
            StringBuilder str = new StringBuilder();
            for(char c : word.toCharArray()){
                str.append(morse[c - 'a']);
            }
            set.add(str.toString());
        }
        System.out.println(set.size());
    }
}
