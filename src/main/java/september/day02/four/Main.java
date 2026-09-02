package september.day02.four;

public class Main {
    public static void main(String[] args) {
        Example exp = new Example();

        exp.ex();

    }
}


class Example {

    void ex() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                return;
            }
            System.out.println(i);
        }
    }

}