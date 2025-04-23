import javax.xml.transform.Source;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
  // q: take input of 2 numbers and print the sum
        /*
        * can write some basic code like
        * takt the input and store that
        * take send input and save that in other variable
        * then add that and save that in another variablel
        * and print that third varible which had the stored sum
        */
        // but the approach is not feasible and have to write it multiple times

        // writing a functions multiple times
        sum();

    }
      static void sum () {
          System.out.println("enter 3 numbers");
        Scanner input = new Scanner(System.in);
        int var1 , var2 , var3 ;
        var1 = input.nextInt();
        var2 = input.nextInt();
        var3 = input.nextInt();

          System.out.println("your sum is " + (var1 + var2 + var3));
    }
}