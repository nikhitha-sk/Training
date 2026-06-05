import java.util.HashSet;

public class longSub {
    public static int len(String s) {
        HashSet<Character> set = new HashSet<>();

        int l = 0, res = 0;

        for (int r = 0; r < s.length(); r++) {

            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
    
    public static void main(String[] args){
        System.out.println(len("abcabcbb"));     // 3
        System.out.println(len("bbbbb"));       // 1
        System.out.println(len("pwwkew"));      // 3
    }
}