import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Richest_coustomer {
    public static void main(String[] args) {
        int[][] costomer = new int[3][3]; // 2 day array
        System.out.println("enter your column");
        Scanner input = new Scanner(System.in);
        for (int[] row : costomer){
            for (int i = 0 ; i < row.length ; i++) {
               row[i] = input.nextInt();
            }
        }
        int result = search(costomer);
        System.out.println(Arrays.deepToString(costomer));
        System.out.println(result);
    }
    static int search(int[][] array){
        int result = 0;
        for (int[] row:array){
            int temp = 0;
            for(int i = 0 ; i < row.length;i++){
             temp+=row[i];
            }
            if(temp >= result){
                result = temp;
            }
        }
        return result ;
    }
}
