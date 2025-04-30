import java.util.Scanner;

public class Search_in_range {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// this will take the input from user
        System.out.println("enter your string");
        String string = input.next();
        System.out.println("enter your range");
        int start = input.nextInt();
        int end = input.nextInt();
        System.out.println("enter the character that you wanna find");
        char find = input.next().charAt(0);
        char[] string_arry = string.toCharArray();// convertes the string to array
        int result =  search(string_arry,start,end,find);
        System.out.println(result+" = -1 means does not exist , 1 means exist");
    }

    static int search(char[] array ,int lower_limit , int upper_limit , char find){
       if (0==array.length) {
           return -1;
       }
        for(int i = lower_limit; i <= upper_limit;i++){
            char character = array[i];
            if(character == find) {
                return i;
            }
        }
        return -1;// character not found
    }
}
