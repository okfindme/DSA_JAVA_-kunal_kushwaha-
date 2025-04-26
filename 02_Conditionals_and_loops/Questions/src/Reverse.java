import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        // this class is to reverse the number
        Scanner input = new Scanner(System.in);
        System.out.println("which number u wanna reverse");
        int number = input.nextInt();
        int temp = 0; // just to hold the value
        while ( number > 0 ) {
          temp = (temp*10) + number%10;
          number /=10;
        } System.out.println(temp);
    }
}
