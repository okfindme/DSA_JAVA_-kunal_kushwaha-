import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number to check the prime number");
        int number =input.nextInt();
        System.out.println(prime_check(number));
    }
    // false means nhi h ,... true means ye h
    static boolean prime_check(int n){
        int a = 2;//will start checking from 2;.......
        if (n <=1) return false;
        while (a*a <= n) {
            if (n%n==0) return false;
            a++;
        }
        return true;
    }
}