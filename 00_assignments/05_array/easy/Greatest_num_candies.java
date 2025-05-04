import java.util.Arrays;

public class Greatest_num_candies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extra = 3 ;
        boolean[] result = greatest_num_candies(candies,extra);
        System.out.println(Arrays.toString(result));
    }
    static boolean[] greatest_num_candies(int[] array , int num ){
        boolean[] arr = new boolean[array.length];// determining the length of boolean array
        int max = 0;
        for(int high : array){//this loop wiil find the maximum number in the loop
            if (high > max){
                max = high;
            }
        }
        for (int i = 0 ; i < array.length ; i++){
           if(array[i] + num >= max ){
               arr[i] = true;
           }
           else {
               arr[i]= false;
           }
        }

        return arr;
    }
}
