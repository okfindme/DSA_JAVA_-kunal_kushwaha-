import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class multi_dimensional {
    public static void main(String[] args) {
        //syntax of multidimensional array
        int[][] array = new int[2][]; // [rows][columns]
        int[][] array1 = {{1,2,3},{1,2},{1,2,3,4}};
        System.out.println(array1[1][1]);
        // to print the 2d array we have to use deeptostring warna wo khali memory address print kar dega .
        System.out.println(Arrays.deepToString(array1));

        // can we apply for each loop for 2d array ??
        System.out.println("for each loop is running ");
        for(int[] number : array1){// here int[] is decalared because we are accessing array inside the array....
             for(int i = 0; i < number.length;i++){// array.length gives the number of rows in a 2d array.
                 System.out.println(number[i]);
             }
            System.out.println(" ");
            System.out.println("running for each inside the for each");
            // int i = 0;
             for( int num : number){
                 System.out.println(num);
             }
            System.out.println("inside for each - for each ended");
        }
    }
}