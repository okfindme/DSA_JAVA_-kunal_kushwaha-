import java.util.Scanner;

public class Input {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());// will output the  number

        // type conversion
        System.out.println("type conversion will be done here !!");
        // type conversion = (type)(value)
        int a = (int)(1312221.22);
        System.out.println(a);
    }
}
