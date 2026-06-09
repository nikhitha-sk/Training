// package Assignment;

import java.util.*;

public class leftRotate {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        d %= arr.size();

        for (int i = 0; i < d; i++) {
            int first = arr.remove(0);
            arr.add(first);
        }

        return arr;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int d = 2;

        System.out.println(rotateLeft(d, arr));
    }
}