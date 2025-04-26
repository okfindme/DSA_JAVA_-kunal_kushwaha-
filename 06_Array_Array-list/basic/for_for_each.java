import java.util.Scanner;

public class for_for_each {
    public static void main(String[] args) {
        int[] array = new int[10]; // initialisation....

        for (int i = 0; i < 10; i++) {
            Scanner input = new Scanner(System.in);
            array[i] = input.nextInt();// will enter the input in array
        }

        for (int number : array){// for every element of the array , print the element...
            System.out.println(number+" element of array");// will print the every element one by one
            // number will repeatedly point to next element until it ends.
        }
    }
}
