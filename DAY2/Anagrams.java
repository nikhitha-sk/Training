// package DAY2;
import java.util.*;

public class Anagrams {
    public static List<List<String>> groupAnagram(String[] str){
        Map<String, List<String>> res = new HashMap<>();

        for(String s : str){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }
            String k = Arrays.toString(count);
            res.putIfAbsent(k,new ArrayList<>());
            res.get(k).add(s);
        }
        return new ArrayList<>(res.values());
    }

    public static void main(String[] args){
        String[] words = {"eat", "tea", "ate", "tan", "ant", "nat", "bat"};
        List<List<String>> res = groupAnagram(words);

        System.out.println("Grouped Anagrams:");

        for(List<String> grp : res){
            System.out.println(grp);
        }
    }
}
