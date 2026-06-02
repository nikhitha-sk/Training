
public class imsertPos{
    public static int search(int[] nums , int target){
        int l = 0, r= nums.length-1;

        while( l <= r ){
            int mid = l + (r-l) / 2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println("Position of 5: " + search(nums, 5));
        System.out.println("Position of 7: " + search(nums, 7));
        System.out.println("Position of 0: " + search(nums, 0));
        System.out.println("Position of 2: " + search(nums, 2));
    }
}