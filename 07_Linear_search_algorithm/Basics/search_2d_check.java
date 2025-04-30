import java.util.Arrays;
import java.util.Scanner;

public class search_2d_check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int row = input.nextInt();
        System.out.println("enter the number of columns");
        int column = input.nextInt();
        int[][] array = new int[row][column];// 2d array decalared and initialised
        // filling the value of array;
        System.out.println("enter the value of matrics");
        for (int[] row_ : array) {
            int i = 0;
            for (int column_ : row_ ){
                row_[i]= input.nextInt();
                i++;
            }
        }
        System.out.println("enter the number that u wanna find in the 2d matrix");
        int find = input.nextInt();

        int result = search(array,find);
        System.out.println(result+" = this is the result");
        System.out.println(Arrays.deepToString(array));

    }
    static int search(int[][] array , int find){
        for (int[] row : array){
            for (int column : row){
                if (column == find) return 1 ;// means the required number exist int the matrics........
            }
        }
        return -1 ; // didn't find the ans the matric
    }
}
