import java.util.Scanner;

public class Ceiling_of_num {
    //ceiling of a num means returning the greatest or equal element to the target
    public static void main(String[] args) {
    //  int[] arr = {2,3,5,9,14,16,18};//array
        char[] arr = {'c','f','j'};
        System.out.println("enter the target element");
        Scanner input = new Scanner(System.in);// taking the input
        char target = input.next().charAt(0);//taking input from the user
        int result = ceiling(arr,target);
        System.out.println(result);

    }

    static int ceiling(char[] arr , char target){
        int start = 0;
        int end = arr.length-1;
        if (target > arr[end]){
            return -1;
        }
        while (start <= end){
             int mid = start + (end-start)/2;//middle value
              if(arr[mid]<target){
                  start = mid+1;
              }
              else {
                  end = mid-1;
              }
        }
        return start;
    }
}