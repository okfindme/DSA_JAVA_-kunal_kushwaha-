import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        // Creating an input object
        Scanner input = new Scanner(System.in);
        // fetching the data from keyboard
        String fruit = input.next();

        switch (fruit) {
            // if break is not given it will keep on going.....
            case "mango":
                System.out.println("your input is " + fruit);
                break;
            case "apple":
                System.out.println("your input text is " + fruit);
                break;
            case "unknown":
                System.out.println("i dont know this fruit name");
                break;
            default:
                System.out.println("just eat somthing known damnit");
        }


    }
}