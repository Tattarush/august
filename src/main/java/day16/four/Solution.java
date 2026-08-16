package day16.four;

import java.util.Random;

public class Solution {
    public static void main(String[] args) {

        Random random = new Random();

        char[] chars = new char[10];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (random.nextInt(100) + 1);
        }

        for (char x : chars) {

            System.out.print(x + " ");

        }
    }
}
