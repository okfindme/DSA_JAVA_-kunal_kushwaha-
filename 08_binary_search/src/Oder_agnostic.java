/*public class Oder_agnostic {
    // what does it means ??
    // we dont know if the array is arranged in accending or decending order
    public static void main(String[] args) {
       // int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr ={ 10,9,8,7,6,5,4,3,2,1,0};
        int result = bi_search(arr,2);
        System.out.println(result);
    }
    static int bi_search(int[] arr , int target){
        int start = 0;
        int end = arr.length -1 ;
        if ( arr[start] > arr[end]){
            while( start <= end ){
                int mid = start + ( end - start)/2;
                if (arr[mid] == target){
                    return mid;
                } else if (target < arr[mid]) {
                    start = mid +1 ;
                }
                else {
                    end = mid -1;
                }
            }
        }
        else{

            while( start <= end ){
                int mid = start + ( end - start)/2;
                if (arr[mid] == target){
                    return mid;
                } else if (target < arr[mid]) {
                    end = mid -1 ;
                }
                else {
                    start = mid +1;
                }
            }
        }
        return -1 ;// this the worst case [ element does not exist ]
    }
}*/

// more optimised codeee

public class Oder_agnostic {
    public static void main(String[] args) {
        int[] ascArr = {1, 3, 5, 7, 9, 11};
        int[] descArr = {11, 9, 7, 5, 3, 1};

        System.out.println(bi_search(ascArr, 7));   // Output: 3
        System.out.println(bi_search(descArr, 7));  // Output: 2
    }

    static int bi_search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Check if array is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1; // target not found
    }
}
