import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number to check the Armstrong number");
        int number =input.nextInt();
        System.out.println(armstrong_check(number));
    }
    /*
    //this is the basic code but it works.........
    static boolean armstrong_check(int num ){
        int a = num%10;
        int temp = num/10;
        int b = temp%10;
        temp = temp/10;
        int c = temp%10;
        if (num == (a*a*a+b*b*b+c*c*c)) return true;
        return false;
    }*/
    static boolean armstrong_check(int num ){
        int original = num;
       int sum = 0;
        while (num >0){
            int rem;
            rem = num%10;
            sum+= rem * rem * rem;
            num = num/10;
        }
        if (sum == original) return true;
        return false;
    }

}
