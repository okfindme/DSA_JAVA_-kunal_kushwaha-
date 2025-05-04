import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Concatenation {
    public static void main(String[] args) {
        int[] array = {1,2,3};// array initialised
        int[] result = concatenate(array);
        System.out.println(Arrays.toString(result));

    }
    static int[] concatenate(int[] array){
        int[] concatenate = new int[array.length*2];// new array will be of 2 times the size of original one
        int temp = 0;
        for (int i = 0 ; i < 2 ; i++){
            for (int j = 0 ; j < array.length;j++){
                concatenate[temp] = array[j];
                temp++;
            }
        }
        return concatenate;
    }
}
