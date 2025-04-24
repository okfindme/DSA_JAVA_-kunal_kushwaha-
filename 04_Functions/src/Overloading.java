public class Overloading {
    public static void main(String[] args) {
        // these two same method will call 2 different method with different parameter type.
        call(1);
        call("aditya");
        call(2);
        call(1,2,34,5,6,7);
    }
    // both the functions has same name but data type of parameter is different.
    static void call (int a){
        System.out.println(1);
    }

    static void call (String name){
        System.out.println("your name is "+ name);
    }

    static void call (int ...a){
        System.out.println("argument variable");
    }
}


