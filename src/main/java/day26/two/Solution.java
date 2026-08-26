package day26.two;

public class Solution {
    public static void main(String[] args) {

        loop:
            for (int i = 0; i < 5; i++) {
                System.out.println("Внешний цикл "+ i);
                for (int j = 0; j < 10; j++) {
                    if(j > 5){
                        System.out.println();
                        continue loop;
                    }
                    System.out.print(j + " ");
                }
            }
    }
}
