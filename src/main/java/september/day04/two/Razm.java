package september.day04.two;

public class Razm {
    public static void main(String[] args) {


        int[] array = {3, 5, 763, 312, 3, 57, 89, 1243, 67, 78, 43, 23, 2, 35, 61, 511, 11, 1};

        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        for (int x : array) {
            System.out.print(x + " ");
        }
    }
}
