import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        String department = input.next();

        switch (id){
            case 1:
                break;
            case 2:
                break;
            case 3:
                switch (department){
                    case "it":
                        System.out.println("you are an it guy");
                        break;
                    case "sales":
                        System.out.println("you are a sales guy");
                        break;
                    default:
                        System.out.println("dont do have any department");
                }
                break;
        }

    }
}
