import jdk.dynalink.beans.StaticClass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Change_value {
    public static void main(String[] args) {
        // create an array
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
    }
    // The original array will be changed because arrays are passed by reference (actually value of the reference),
    // so changes inside the function affect the original array.

    static void change(int[] nums){
        nums[0] = 99;
    }
}
