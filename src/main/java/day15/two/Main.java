package day15.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


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

    public static List<Integer> copy(int[] array) {
        return Arrays.stream(array).boxed().collect(Collectors.toList());
    }

}
