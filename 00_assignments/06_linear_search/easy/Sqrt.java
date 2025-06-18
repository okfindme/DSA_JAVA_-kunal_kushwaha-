
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
class Main {
    public static void main(String[] args) {
        int[] array = {2,7,11,15};
        int[] ans = twoSum(array,9);
        System.out.println(Arrays.toString(ans));
    }
    static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length ; i++){
            int start = i+1;
            int end = numbers.length-1;
            while (start<end){
                int mid = start +(end - start)/2;
                if (numbers[i]+numbers[mid] == target){
                   return new int[] { i+1 ,mid+1};
                }
                else if (numbers[i]+numbers[mid] > target){
                    end = mid;
                }
            }
        }
        return new int[] {-1,-1};
    }
}
/*class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length ; i++){
            for (int j = i+1; j< numbers.length ; j++){
                if (numbers[i]+numbers[j]==target){
                    return new int[] {i+1,j+1};
                }
            }
        }
         return new int[] {-1,-1};
    }
}*/