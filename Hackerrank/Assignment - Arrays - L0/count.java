import java.util.*;

public class count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int pCount = 0, nCount = 0, zCount = 0;

        for(int i=0; i<n; i++){
            if(arr[i] > 0)
                pCount++;
            else if(arr[i] < 0)
                nCount++;
            else
                zCount++;
        }

        sc.close();
        System.out.print(pCount+" "+nCount+" "+zCount);
    }
}
