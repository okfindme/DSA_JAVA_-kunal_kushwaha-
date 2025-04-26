import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("enter the length of array ");
        int user = input.nextInt();
        for(int i = 0 ; i < user ; i++){
            arrayList.add(input.nextInt());
        }
        System.out.println("this is the original array");
        System.out.println(arrayList);
        reverse(arrayList);
        System.out.println("this is the reversed array");
        System.out.println(arrayList);
    }
    static void reverse(ArrayList<Integer> array){
        for ( int i = 0 ; i <array.size()/2; i++){
            int temp = array.get(i);
            array.set(i,array.get(array.size()-1-i));
            array.set(array.size()-1-i,temp);
        }
     //   return ;
    }
}
