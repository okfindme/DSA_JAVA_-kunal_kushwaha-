import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        System.out.println("enter how many times u wanna run this loop");
        Scanner input = new Scanner(System.in);
        int condition = input.nextInt();
        int number = 1;
        while (number <= condition){
            System.out.println("running "+ number);
            number++;
        }
    }
}
