// package Assignment2;

public class setZero {
    public static void matZero(int[][] mat){
        int r = mat.length, c = mat[0].length;

        boolean[] row = new boolean[r];
        boolean[] col = new boolean[c];

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(mat[i][j] == 0){
                    row[i]  =true;
                    col[j] = true;
                }
            }
        }

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(row[i] || col[j]){
                    mat[i][j] = 0; 
                }
            }
        }
    }

    public static void main(String[] args){
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};

        matZero(matrix);
        
        for(int[] row : matrix){
            for(int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
