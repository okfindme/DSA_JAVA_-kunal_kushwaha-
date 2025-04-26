import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        Scanner input = new Scanner(System.in);
        int change = input.nextInt();
        int change_to = input.nextInt();
        swap(array,change,change_to);
        System.out.println(Arrays.toString(array));
    }

    static void swap(int[] arr,int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
