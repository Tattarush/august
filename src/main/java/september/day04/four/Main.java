package september.day04.four;

public class Main {
    public static void main(String[] args) {

        int[] array = {2, 5, 6, 3, 2, 5, 6, 7};
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum1 += array[i];
        }

        for (int x : array) {
            sum2 += x;
        }

        System.out.println(sum1);
        System.out.println(sum2);
    }
}
