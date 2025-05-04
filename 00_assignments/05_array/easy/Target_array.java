import java.util.ArrayList;
import java.util.Arrays;

public class Target_array {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] result = target(nums , index);
        System.out.println(Arrays.toString(result));
    }
    static int[] target(int[] nums , int[] index){
       ArrayList<Integer> demo_result = new ArrayList<>();
       int[] result = new int[nums.length];
        for(int ini = 0 ; ini < nums.length ; ini++){
           demo_result.add(index[ini],nums[ini]);
        }
        for (int i = 0 ; i < nums.length; i++){
            result[i] = demo_result.get(i);
        }
        return result;
    }
}
