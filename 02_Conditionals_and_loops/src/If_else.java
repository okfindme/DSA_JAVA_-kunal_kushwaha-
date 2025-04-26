import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class If_else {
    public static void main(String[] args) {
        // just basic if and else program
        System.out.println("enter your number");
        Scanner a = new Scanner(System.in);
        int number = a.nextInt();
          if ( number== 10 ){
              System.out.println("a is 10");
          }
          else {
              System.out.println("your entered number is not equal to 10");
          }
        }
    }
