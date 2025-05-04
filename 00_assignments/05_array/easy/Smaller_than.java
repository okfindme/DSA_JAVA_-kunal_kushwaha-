import java.lang.reflect.Array;
import java.util.Arrays;

public class Smaller_than {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] result = smaller(nums);
        System.out.println(Arrays.toString(result));
    }
    static int[] smaller(int[] nums){
        int[] result = new int[nums.length];//equal length array
        for (int i = 0 ; i < nums.length ; i++){//this loop will iterate over all the element
            int smaller = 0;// will the greater number
            for (int ele : nums){
                if (ele<nums[i]){
                    smaller++;
                }
            }
            result[i] = smaller;
        }
        return result;
    }
}
