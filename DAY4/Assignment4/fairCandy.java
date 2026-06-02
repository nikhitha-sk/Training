import java.util.*;

public class fairCandy {
    public int[] candy(int[] alice , int[] bob){
        int sumA = 0, sumB = 0;

        for(int a : alice)
            sumA += a;
        for(int b: bob)
            sumB += b;

        int diff = (sumB - sumA) / 2;

        Set<Integer> setB = new HashSet<>();

        for(int b : bob)
            setB.add(b);

        for(int a : alice){
            if(setB.contains(a + diff)){
                return new int[] {a, a+diff};
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        fairCandy fc = new fairCandy();
        int[] alice = {1, 3, 2};
        int[] bob = {3, 1, 2};
        int[] result = fc.candy(alice, bob);
        System.out.println("Alice picks: " + result[0] + ", Bob picks: " + result[1]);
    }
}
