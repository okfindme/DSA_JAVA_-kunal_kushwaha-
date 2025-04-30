import java.util.Arrays;
import java.util.Scanner;

public class Search_2d_index {
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

        int[] result = scan(array,find);// result has to be a array to store the array.....
        System.out.println(result[0]+" = number of rows" + result[1]+" = number of columns");
        System.out.println(Arrays.deepToString(array));
    }
    static int[] scan(int[][] array, int find){
        int i = 0 ;// -- number of row
        for (int[] row: array){
            int j = 0 ;//-- number of column
            for (int column : row){
                if (column == find){
                    int[] arr = {i,j};
                    return arr;
                }
                j++;// incrementing the column number after each column check...
            }
            i++;// incrementing the row number after column loop ends...
        }
        int[] arr = {-1,-1};
        return arr;
    }
}
