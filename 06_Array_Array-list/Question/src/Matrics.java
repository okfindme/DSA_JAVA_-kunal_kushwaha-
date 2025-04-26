import java.util.Arrays;
import java.util.Scanner;

public class Matrics {
    public static void main(String[] args) {
     /*things i have to do is :-
     * take user input of number of rows
     * take user input of number of columns
     * store that in rows and columns format specified by the user
     */
        Scanner input = new Scanner(System.in);
        System.out.println("enter the rows and columns in your matrics");
        int row = input.nextInt();
        int col = input.nextInt();

        int[][] matric = new int[row][col];
        for(int[] rows : matric){
           for (int i = 0 ; i < rows.length ; i++){
               rows[i] = input.nextInt();
           }
        }
     //   System.out.println(Arrays.deepToString(matric));
        // now i am printing the array.....
        System.out.println("now i am printing the array that user inputed");

        for(int[] r: matric){
            System.out.println("i am printing the row");
            for(int c : r){
                System.out.println(c);
            }
            System.out.println(" now i am printing next rows column");
        }
    }
}