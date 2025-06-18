import java.util.Arrays;

public class Question {
    public static void main(String[] args) {
  int[] arr1 = {1,2,3,0,0,0};
  int[] arr2 = {9,8,7,6};
  int m = 10;
  int n = 4;
  merge(arr1,m,arr2,n);
        System.out.println(Arrays.toString(arr1));
    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        merged(nums1,nums2,m,n);
        bubble_sort(nums1);
    }

    static void bubble_sort(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for (int j = 1 ; j < arr.length-i;j++){
                if(arr[j-1]> arr[j]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                }
            }
        }
    }

    static void merged(int[] arr1 , int[] arr2 , int m , int n){
        int index = m-n; // this will be the last element of 2nd array
        int i = 0;
        while (index < m){
            arr1[index] = arr2[i];
            index++;
            i++;
        }


    }
}
