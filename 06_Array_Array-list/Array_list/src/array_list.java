import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {
     // syntax = ArrayList<Integer> array = new ArrayList<Integer>();
ArrayList<Integer> list = new ArrayList<>();
 //array.add just add the number in the list
        list.add(12);
        list.add(11);
        list.add(10);
        list.add(9);
        list.add(8);
        // set () it is used to set the required place value number.
        list.set(2,89);// changes the second index to 89
        System.out.println(list);
        //iterating over a dynamic array
        for (int a : list){
            System.out.println(a);
        }
    }
}