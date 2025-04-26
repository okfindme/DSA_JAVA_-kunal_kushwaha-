import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>(10);// initialised the dyanamic array...
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for(int i =0; i < number; i++){
           array.add(input.nextInt());
        }

       int maximun =  max(array);
        System.out.println(maximun);
    }

   static int max(ArrayList<Integer> array){
        int max = 0 ;
        for (int num : array){
            if (num>max){
                max = num;
            }
        }
        return max;
    }
}
