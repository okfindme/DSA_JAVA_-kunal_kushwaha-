import java.util.ArrayList;
import java.util.Arrays;

public class Permutation_array {
    public static void Main(String[] args){
     int[] array = {1,2,3};
     int[] result = getConcatenation(array);
        System.out.println(Arrays.toString(result));
    }
    static int[] getConcatenation(int[] nums) {
        int temp = 0 ;
      int[] array = new int[nums.length*2];// creating a array which is 2x size of original array....
        for(int j = 0 ; j < 2; j++){
            for(int i = 0 ; i < nums.length; i++){
                array[temp] = nums[i];
                temp++;
            }
        }
        return array;
    }
}