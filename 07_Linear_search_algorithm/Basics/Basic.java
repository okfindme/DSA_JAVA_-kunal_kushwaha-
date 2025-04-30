public class Basic {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9};
        int target = 10;// as the 10 does not exist it will give -1 ...as a indux value.
        int ans = linear(number,target);
        System.out.println(ans+" "+"is the index of provided element");
    }
    //search in the array: return the index if the item found
    //otherwise if item not found return -1
    static int linear (int[] array , int target) {
        if (array.length == 0){
            return -1;
        }
        for (int i = 0 ; i < array.length;i++){
            // check for the element at every index if it is  = target
            int element = array[i] ;
            if (element == target){
                return i;
            }

        }
        return -1;
    }
}