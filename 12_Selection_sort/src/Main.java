import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,6,4,7,9,8};
        slection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void slection(int[] arr) {
       for (int i = 0 ; i < arr.length ; i++){
           // find the max item in the remaining array and swap with the correct index
           int last = arr.length-i-1;
           int maxIndex = getMaxIndex(arr,0,last);

           swap(arr,maxIndex,last);
       }
    }

    static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for (int i = start ; i <= last ;i++){
          if (arr[max]<arr[i]){
              max = i;
          }
        }
        return max;
    }

    static void swap(int[] arr,int first ,int second ){
         int temp = arr[first];
         arr[first] = arr[second];
         arr[second]= temp;
    }
}