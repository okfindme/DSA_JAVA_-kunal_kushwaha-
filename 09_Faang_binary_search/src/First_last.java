import java.util.Arrays;

public class First_last {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4,5,6,7,8,8,8,9};
        int target = 8;
        int result1 = leftmost(arr,target);
        int result2 = rightmost(arr,target);
        System.out.println(Arrays.toString(new int[]{result1, result2}));
    }
    static int leftmost(int[] arr, int target){
        int str = 0;
        int end = arr.length-1;
        int result = -1;

        while ( str <= end){
            int mid = str + (end - str)/2;
            if ( arr[mid]== target){
                result = mid;// this will update everytime mid is the target value
                end = mid -1;// this will short the array for further left most search
            }
            else if (arr[mid]> target){
                end = mid -1;
            }
            else {
                str = mid +1;
            }
        }

        return result;
    }

    static int rightmost(int[] arr, int target){

        int str = 0;
        int end = arr.length-1;
        int result = -1;

        while ( str <= end){
            int mid = str + (end - str)/2;
            if ( arr[mid]== target){
                result = mid; //same as above
                str = mid + 1; // same as above
            }
            else if (arr[mid]> target){
                end = mid -1;
            }
            else {
                str = mid +1;
            }
        }
        return result;
    }
}
