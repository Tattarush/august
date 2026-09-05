package september.day05.razm;

public class Main {
    public static void main(String[] args) {


        int[] array = {2, 4, 5, 5, 3, 2, 1, 21, 4, 6, 567, 4, 32, 12, 1, 1, 4, 6, 7, 89};

        System.out.println("Before ");

        for (int x : array) {
            System.out.print(x + " ");
        }

        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        System.out.println("\nAfter ");
        for (int x : array) {
            System.out.print(x + " ");
        }

    }
}
