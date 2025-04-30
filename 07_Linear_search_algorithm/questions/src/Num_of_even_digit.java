import java.util.ArrayList;
import java.util.Arrays;

public class Num_of_even_digit {
    public static void main(String[] args) {
        int[] arry = {12,345,2,6,7896};// array is decalared
       // ArrayList<Integer> arrayList = new ArrayList<Integer>();// dynamic array to add the number

       ArrayList<Integer> result = Iseven(arry);
        System.out.println(result);
    }
    static ArrayList<Integer> Iseven(int[] arr){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0 ; i < arr.length;i++){
            int temp = 0;// old the number of number present.
            int old = arr[i]; // stores the old number.....
            while (arr[i]>0){//checks the number of digits
                arr[i] = arr[i]/10;
                temp++;
            }
            if (temp%2==0){
                arrayList.add(old);
            }
         }
        return arrayList;
       }
    }

