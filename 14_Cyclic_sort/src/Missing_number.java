import java.util.Arrays;

public class Missing_number {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
       int missing_number = cyclic(arr);
        System.out.println(missing_number);
    }
    static int cyclic(int[] arr){
      int i = 0;
        int missing = 0;
      while (i < arr.length){
          int correct = arr[i]-1;
          if (arr[i]==0){
              missing = i;
              i++;
          } else if (arr[i]!=arr[correct]) {
              int temp = arr[correct];
              arr[correct] = arr[i];
              arr[i] = temp;
          }
          else {
              i++;
          }
      }
      return missing+1;

    }
}
