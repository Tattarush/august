package day26.first;

public class Solution {
    public static void main(String[] args) {

        int num = 100;

        for (int i = 0; i < num; i++) {
            if ((i * i) >= num) {
                break;
            }
            System.out.print(i + " ");
        }

    }
}
