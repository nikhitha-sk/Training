import java.util.Scanner;

public class sortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums1 = new int[n];

        for(int i=0; i <n; i++){
            nums1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] nums2 = new int[m];

        for(int i=0; i<m; i++){
            nums2[i] = sc.nextInt();
        }

        int[] merge = new int[n+m];
        int i=0 , j=0, k=0;

        while( i<n && j < m){
            if(nums1[i] <= nums2[j]){
                merge[k++] = nums1[i++];
            }else{
                merge[k++] = nums2[j++];
            }
        }

        while( i < n){
            merge[k++] = nums1[i++];
        }
        while( j < m){
            merge[k++] = nums2[j++];
        }

        for(int x : merge){
            System.out.print(x+" ");
        }
        sc.close();
    }
}
