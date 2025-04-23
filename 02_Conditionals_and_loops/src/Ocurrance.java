import java.util.Scanner;

public class Ocurrance {
    public static void main(String[] args) {
        // in this programme we gonna check how many times the number occured
        System.out.println("what u wanna count");
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        System.out.println("from which u wanna count");
        int number = input.nextInt();
        int num_count = 0 ;
         while (number > 0) {
             int remainder = number%10;
             // checking the remainder which is the last digit as when divided by 10 it will only gives the last digit as remainder
             if (remainder==count){
                 num_count++;
             }
             number = number/10;// it removes the last digit as when we divide any number by then either remainder gets removed or 0 gets cancel.
         }
        System.out.println("number of required count is = "+num_count);
    }
}
