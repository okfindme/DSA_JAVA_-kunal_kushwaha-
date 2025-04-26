import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        /*
        * Syntax --
        *  datatype[] variable_name = new datatype[size]
        *  -> or <-
        * int[] variable = {}
        * */
        int[] arry = new int[10];
        arry[0] = 1 ;//value putting
        arry[2]= 100;//value putting
       // arry[11]=2;//will give an array as like javascript you cann't increase the array size after it is declared in the java.
        System.out.println(Arrays.toString(arry));// converts the array in string...
        System.out.println(arry);// it will print the memory address where it is stored in memory
    }
}