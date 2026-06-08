import java.util.*;

public class FindWords{
    public static void main(String[] args){

        String[] words = {"leet","code","code","job","bob","lemon"};
        char x = 'e';
    
        List<Integer> res=  new ArrayList<>();
    
        for(int i=0; i< words.length; i++){
            if(words[i].contains(Character.toString(x))){
                res.add(i);
            }
        }
        System.out.println(res);
    }
}
