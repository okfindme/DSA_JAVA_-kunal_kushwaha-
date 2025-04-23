import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the 3 numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
         // now i wanna find the largest number

        // this is my first attempt code
        if ( a < b ){
            if (b<c) {
                System.out.println("c is the largest number");
            }
            else {
                System.out.println("b is the largest number");
            }
        }
        else if (b<a){
            if (a < c ){
                System.out.println("c is the largest");
            }
            else {
                System.out.println("a is the largest number");
            }
        }
        else {
            System.out.println("a is the largest number");
        }
        System.out.println("your program is finished");

        /*
        * this is more optimised code to do the same task
         int largest;
         if (a >= b && a >= c) {
            largest = a;
         }
         else if (b >= a && b >= c) {
            largest = b;
         }
         else {
            largest = c;
         }
         System.out.println(largest + " is the largest number");
         System.out.println("your program is finished");
        * */
    }
}