import java.util.Arrays;

public class Variable_arguments {
   // static int[] arry = {0,1,2,3,4,5,6,7,8};
    static int name = 2024;
    static int number = 036;
    public static void main(String[] args) {
        //fun(arry);
        fun(name,number);// all these arguments are get converted into arrays which can be used.....
    }
    static void fun (int ...v)// ...v indicates that this is variable argument means it will take array of int or any primitive data type that we declare....
    {
        System.out.println(v);// this will print the memory address
        System.out.println(v[1]);
        System.out.println(Arrays.toString(v));
    }
}
