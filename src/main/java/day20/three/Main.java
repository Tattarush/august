package day20.three;

public class Main {
    public static void main(String[] args) {

        System.out.println(true && true);
        System.out.println(true || false);

        System.out.println("--------------------");
        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(false ^ true);
        System.out.println(true ^ false);

        System.out.println("--------------------");
        int a = 42;
        System.out.println(a ^ a);
    }
}
