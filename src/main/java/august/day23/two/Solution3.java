package august.day23.two;

public class Solution3 {
    public static void main(String[] args) {

        double num, scroot, sq;

        for (num = 1.0; num <= 100.0; num++) {

            sq = Math.sqrt(num);
            System.out.println("Квадратный корень из "+ num + " равен - " + sq);

            scroot = num - (sq * sq);
            System.out.println("Ошибка округления равна - " + scroot);
        }

    }
}
