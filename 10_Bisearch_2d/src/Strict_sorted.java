public class Strict_sorted {
    public static void main(String[] args) {

    }
    static int[] binarysearch(int[][] matrix , int row , int cstart , int cend , int target){
        while (cstart <= cend){
            int mid = cstart + ( cend - cstart)/2;
            if (matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if (matrix[row][mid] < target){
                cstart = mid+1;
            }
            else {
                cend= mid -1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] arr_2od , int target){
        int rstart =  0;

        int rend = arr_2od.length;
        int cols = arr_2od[0].length-1;
        int rend = rend-1;
        int cmid = cols/2;

        if (rend == 1 ){
            return  binarysearch(arr_2od,0,0,cols,target);
        }
      // run the loop till 2 loops are remaining....
        while(rstart )
    }
}

