public class Good_pair {
    public static void main(String[] args) {
        int[] num = {1,1,1,1};
        int result = good_pair(num);
        System.out.println(result);
    }
    static int good_pair(int[] array){
        int good_pair = 0;
        for(int i = 0 ; i < array.length ; i++){
            for (int j = 1 + i; j < array.length ; j++){
                if(array[i] == array[j]){
                    good_pair++;
                }
            }
        }
        return good_pair;
    }
}
