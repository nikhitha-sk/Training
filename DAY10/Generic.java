// package DAY10;

public class Generic <T>{
    void printArray(T[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){

        Generic obj = new Generic();
        Integer[] nums = {1,2, 3,4,5};
        String[] s = {"pop","pump","jump","hello","world"};
        
        obj.printArray(nums);
        obj.printArray(s);

    }
}
