public class scope {
    public static void main(String[] args) {
        // i have initialised the variable
        int a = 90;
        int b = 100;
        {
            a = 89;// this  changes the initialised variable.. hence its value
            System.out.println(a);
            int c = 110;// it wont be accessed outside the block.
        }
        System.out.println("out of block scope");
        System.out.println(a);// prints the changed variable...
       // System.out.println(c); // c is outside the scope as scope travells inwards not outwars


        //scope in for-loops
        // as i have initialised the a earlier it can be accessed inside , it not passing by value
        // decrement decreases the real value of a
        for (int i =1 ; i < a ; a-- ) {
            System.out.println(i);
            i++;
        }
        // after loop is ended , value of a is decreased.......
        System.out.println("for loop ended");
        System.out.println(a);
    }
}
