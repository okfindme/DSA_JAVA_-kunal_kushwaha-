public class Shadowing {
    // have to provide the static here as if not provided we cannot pass it in static class
    static int a =20 ;// can be accessed all under the lower block
    public static void main(String[] args) {
        System.out.println(a);
        /*
        *  Q) what does shadowing means ??
        * -->>using the 2 different same name variable within the same scope which over lapses
        */
        String a = "aditya";
        System.out.println("printing shadowed a");
        System.out.println(a);
        // lower scope variable always overshadows the upper scope variable.
    }
}
