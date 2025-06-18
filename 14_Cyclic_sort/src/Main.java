import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.swap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
  int [] arr ={4,6,5,3,2,1};
  Cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Cyclic (int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct_index= arr[i]-1;// number at position i should be at this index
            if (arr[i]!=arr[correct_index]){
                int temp = arr[correct_index];
                arr[correct_index]= arr[i];
                arr[i]=temp;
            }
            else {
                i++;
            }
        }
    }
}