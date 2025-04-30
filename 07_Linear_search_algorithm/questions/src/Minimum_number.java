import java.lang.classfile.attribute.SyntheticAttribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Minimum_number {
    public static void main(String[] args) {
        // i will impliment it in the dynamic array ..
        Scanner input = new Scanner(System.in);// will take the input from the user.......
        ArrayList<Integer> arrayList = new ArrayList<Integer>(); // initialised the array
        int arr_len = input.nextInt();
        for (int i = 0 ; i < arr_len ; i++){
            arrayList.add(input.nextInt());// this will add the numbers in the array
        }
        int result = minimum(arrayList);
        System.out.println("this is the smallest number in the array ="+result);
    }
   static int minimum(ArrayList<Integer> arrayList){
        int temp = arrayList.getFirst();// gives the first element of arraylist
        for (int num : arrayList){
            if (temp > num){
                temp = num;
            }
        }
        return temp;//means not any item is minimum......
   }
}
