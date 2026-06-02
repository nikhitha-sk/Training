public class min2 {

    public static void main(String[] args) {

        int[] a = { 11, 12, 13, 14, 15 };

        int l = 0, r = a.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (a[mid] > a[r])
                l = mid + 1;
            else
                r = mid;
        }
        System.out.println(a[l]);
    }
}
