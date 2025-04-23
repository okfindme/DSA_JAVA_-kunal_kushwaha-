import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        //program to check if the character is capital or not
        char lower_character = 'a';
        char end_lower = 'z' ;

        System.out.println("enter your character");
        Scanner input = new Scanner(System.in);
        char user_input = input.next().charAt(0);
        if ( user_input < lower_character ){
            System.out.println("input is capital");
        }
        else {
            System.out.println("input is lower case");
        }
        // mainly i can add more features and more strict checking.....
    }
}
