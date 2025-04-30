import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Search_in_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.next();
        char find = input.next().charAt(0);
        char[]name1 = name.toCharArray();
        int index_value = search(name1,find);
        //System.out.println(name1[0]);
        System.out.println(index_value+" "+"index value of your input");
    }
    // search the character in the string
    static int search (char[] array , char find ){
        if ( 0==array.length) return -1;
        for (int i = 0; i < array.length; i++){
            char temp = array[i];
            if (temp == find){
                return i;
            }
        }
        return -1;
    }
}