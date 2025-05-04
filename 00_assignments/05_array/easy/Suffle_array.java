import java.util.Arrays;

public class Suffle_array {
    public static void main(String[] args) {
        int[] array = {2,5,1,3,4};
        int[] result = shuffle(array);
        System.out.println(Arrays.toString(result));
    }
    static int[] shuffle(int[] array){
        int[] arr = new int[array.length];
        int index = 0;
        for (int i = 0 ; i < array.length/2 ; i++){
            arr[index] = array[i];
            index += 2;
        }
        int index2 = 1;
        for (int i = array.length/2 ; i < array.length ; i++){
            arr[index2] = array[i];
            index2 += 2;
        }
        return arr;
    }
}
