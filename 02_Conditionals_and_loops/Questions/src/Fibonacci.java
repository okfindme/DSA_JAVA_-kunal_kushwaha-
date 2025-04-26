import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // this program will run print the fibonacci series;
        //0,1,1,2,3,5......
        int a = 0 ;
        int b =1 ;
        System.out.println("how many fibonacci u want ?");
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        for ( int i = 1 ; i <= user ; i++){
            System.out.println(a+b);
            int c = a+b;// temp variable to hold the sum
            a = b ;
            b = c;

        }
    }
}
