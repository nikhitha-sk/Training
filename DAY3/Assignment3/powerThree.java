// package Assignment3;

public class powerThree {
    
    public static boolean power(int n){
        if( n <= 0) return false;

        while( n % 3 == 0){
            n /= 3;
        }
        return n == 1;
    }

    public static void main(String[] args){
        int n = 27;
        System.out.println(power(n));
    }
}
