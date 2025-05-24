public class Num_in_infinite {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7,8,9,10,11,12};
        int result = findd( arr , 4);
        System.out.println(result);
    }
    static int findd(int[] arr, int target) {
        //first find the range
        //first start with a box of size 2
        int str = 0 ;
        int end = 1;
        while (target > arr[end]){
            int temp = end+1;
            //double the box value
            //end = previous end + sizeofbox*2;
            //sizeofthebox = (end - str +1 )
            end = end + (end -str +1)*2;
            str = temp;

        }
        return binary_search(arr,target,str ,end );
    }

    static int binary_search(int[] arr, int taregt , int str , int end) {
        while (str<=end){
            int mid = str+(end - str)/2;
            if(arr[mid]==taregt){
                return mid;
            }
            else if (arr[mid]>taregt){
                end = mid -1 ;
            }
            else {
                str= mid+1;
            }
        }
        return -1;
    }
}
