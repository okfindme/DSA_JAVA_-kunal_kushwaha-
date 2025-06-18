import java.util.Arrays;

public class Two_sum {
    public static void main(String[] args) {
        int[] arr = {2,5,5,10};
        int taget = 10;
        int[] ans = twoSum(arr,taget);
        System.out.println(Arrays.toString(ans));
    }

    static int[] twoSum(int[] nums, int target) {
        int start = 0 ;
        int end = nums.length-1;
        while (start <= end){
            int mid = start + ( end - start )/2;
            for (int i = 0 ; i < nums.length ; i++){
                for (int j = i+1; j < nums.length;j++){
                    if (nums.length == 2){
                        return new int[] {0,1};
                    }
                    if(nums[i]+nums[mid]==target){
                        return new int[] {i,mid};
                    }
                    if (nums[i]+nums[mid]>target){
                        end = mid-1;
                    }
                    else {
                        start = mid+1;
                    }
                }
            }
        }

        return new int[] {-1,-1};
    }
}
