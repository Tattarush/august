package day23.two;

public class Solution2 {
    public static void main(String[] args) {

        int i;
        for (i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("i = 0");
                    break;
                case 1:
                    System.out.println("i = 1");
                    break;
                case 2:
                    System.out.println("i = 2");
                default:
                    System.out.println("i > 2");
                    break;
            }

        }
    }
}
