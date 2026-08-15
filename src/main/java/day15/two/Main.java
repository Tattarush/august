package day15.two;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];

        fill(array);
        print(array);
        List<Integer> arr = copy(array);
        System.out.println();
        System.out.println(arr);

    }

    public static void fill(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }
    }

    public static void print(int[] array) {
        for (int x : array) {
            System.out.print(x+ " ");
        }
    }

    public static ArrayList<Integer> copy(int[] array) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            arr.add(array[i]);
        }
        return arr;
    }

}
