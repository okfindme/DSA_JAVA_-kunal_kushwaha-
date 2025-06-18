import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
  int[] arr = {3,2,5,4,6,1};
  insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion (int[] arr){
        for (int i = 0; i < arr.length-1;i++){
            for (int j = i+1;j > 0;j--){
                if (arr[j]> arr[j-1]){
                    break;
                } else if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= temp;
                }
            }
        }
    }
}