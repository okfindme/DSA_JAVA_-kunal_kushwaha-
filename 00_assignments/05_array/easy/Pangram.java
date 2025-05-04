import java.util.ArrayList;

public class Pangram {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        boolean result = pangram(alphabet);
        System.out.println(result);
    }
    static boolean pangram(String sentence){// array of
        char[] chararray = sentence.toLowerCase().toCharArray();
        boolean[] array = new boolean[26];
        int count = 0;
        for (char c : chararray){
            if (c >= 'a' && c <= 'z'){
                int a = c -'a';
                if (!array[a]){
                    array[a]= true;
                    count++;
                }
            }

        }
       return  count == 26;
    }
}
