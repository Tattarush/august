package september.day02.five;

public class Main {
    public static void main(String[] args) {

        Example exp = new Example();
        System.out.println(exp.isEven(6));

        if (exp.isEven(10)) {
            System.out.println("Четное");
        }

        System.out.println(exp.isFactor(20, 2));
    }
}


class Example {

    boolean isEven(int num) {

        return num % 2 == 0;

    }

    boolean isFactor(int x, int y) {
        if(x % y == 0) return true;
        else return false;
    }
}