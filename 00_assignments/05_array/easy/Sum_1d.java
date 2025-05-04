import java.util.Arrays;

public class Sum_1d {
    public static void main(String[] args) {
        int[] array = {1 ,2 ,3 ,4 };
        int[] result  =  sum(array);
        System.out.println(Arrays.toString(result));
    }
    static int[] sum (int[] array){
        int[] arr = new int[array.length];
        for(int i = 0 ; i < array.length ; i++){
            if(i <= 0){arr[i] = array[i];}
            else {
                arr[i] = arr[i-1]+array[i];
            }
        }
        return arr;// reesturning the summed array
    }
}
