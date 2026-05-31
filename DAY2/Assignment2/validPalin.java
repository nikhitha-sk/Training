// package Assignment2;

public class validPalin {
    public static boolean palin(String s){
        int l=0 , r = s.length()-1;

        while(l < r){
            while(l < r && !Character.isLetterOrDigit(s.charAt(l)))
                l++;
            while(l < r && !Character.isLetterOrDigit(s.charAt(r)))
                r--;
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(palin(s));
    }
}
