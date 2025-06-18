import java.util.Arrays;

public class Main  {
    public static void main(String[] args) {
        // buble sort about
        int[] arr = {1,3,4,5,2,9,7,8};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble (int[] arr){
        // run the loop for n-1 times
        for ( int i = 0 ; i < arr.length ; i++){
            for (int j = 1 ; j < arr.length-i;j++){
                if (arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}