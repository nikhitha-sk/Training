// package DAY2;

import java.util.*;

public class rotateImage {
    public static void rotate(int[][] mat) {
        int size = mat.length;

        //Transpose
        for (int r = 0; r < size; r++) {
            for (int c = r + 1; c < size; c++) {
                mat[r][c] ^= mat[c][r];
                mat[c][r] ^= mat[r][c];
                mat[r][c] ^= mat[c][r];
            }
        }


        //Reverse rows
        for (int r = 0; r < size; r++) {
            int left = 0, right = size - 1;

            while (left < right) {
                mat[r][left] ^= mat[r][right];
                mat[r][right] ^= mat[r][left];
                mat[r][left] ^= mat[r][right];
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        rotate(mat);

        for (int[] r : mat) {
            System.out.println(Arrays.toString(r));
        }

    }
}
