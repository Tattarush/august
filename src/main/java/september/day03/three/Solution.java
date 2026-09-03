package september.day03.three;

public class Solution {
    public static void main(String[] args) {

        int[] array = {4, 4, 6, 8, 23123, 3, 4, 61, 0, 3, 56};

        int[] sor =  sort(array);

        for (int i = 0; i < sor.length; i++) {
            System.out.print(sor[i] + " ");
        }
    }

    static int[] sort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }
}
