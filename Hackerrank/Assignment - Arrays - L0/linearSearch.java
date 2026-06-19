import java.util.*;

public class linearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int k  =sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int res = -1;

        for(int i=0; i<n; i++){
            if(arr[i] == k){
                res=  i;
                break;
            }
        }
        sc.close();
        System.out.print(res);
    }
}
