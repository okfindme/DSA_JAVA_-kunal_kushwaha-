public class Sim_binary {
    public static void main(String[] args) {
     int[] arr = {1,2,3,4,5,6,7,8,9,10};
     int result = binarysearch(arr,2);
        System.out.println(result);
    }
    // return the array
    // return -1 if  it does not exist
    static int binarysearch(int[] arr , int target){
      int start = 0;
      int end = arr.length - 1;// total number of comparison that we have to perform
        while( start <= end){
            // find the middle element
            int middle = (start+ end)/2;
            //better way to find the mid ? => start + (end - start) /2 ;
            if (arr[middle]==target){
                return middle;// index of the element;
            } else if (target < arr[middle]) {
                end = middle -1;
            } else {
                start = middle+1;
            }
        }
        return -1;
    }
}