import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       //int number  = input.nextInt();
        // i have to always initialise the number ;
        for(  int number  = input.nextInt(); number <= 5 ;number++){
            System.out.println("currently your number is "+ number);
        }
        System.out.println("loop ended");
    }
}
