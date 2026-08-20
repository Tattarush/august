package day20.two;

public class Main {
    public static void main(String[] args) {

        int x = 10;
        int y = ++x;  //префиксная форма
        System.out.println(y);

        int z = 10;
        int f = z++; //постфиксная форма
        System.out.println(f);
    }
}
