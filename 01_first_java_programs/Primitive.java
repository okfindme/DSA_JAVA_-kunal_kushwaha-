import java.util.Scanner;

public class Primitive {
    public static void main (String[] args){
        /*"new" calls the Scanner constructor, creating an object that reads from System.in.
        The variable 'input' now refers to that Scanner object and can be used to call its methods like input.nextLine()*/
        Scanner input = new Scanner(System.in);
        // string is not primitive data type,
        System.out.println("tell me your name");
        String name = input.nextLine();

        //scans the age
        System.out.println("tell me your age");
        int age = input.nextInt();
        System.out.println("your name is "+ name + ","+ age +"is your age !!");

    }
}
