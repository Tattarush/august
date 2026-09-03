package september.day03.two;

public class Main {
    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {

            if (min > array[i]) {
                min = array[i];
            }

            if (max < array[i]) {
                max = array[i];
            }
        }

        System.out.println("Минимум "+ min + " Максимум "+ max);
    }
}
