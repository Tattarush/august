package september.day03.four;

public class Main {
    public static void main(String[] args) {


        int[][] arrr = {{12, 3, 4, 5, 6}, {4, 3, 5, 6, 7}};


        for (int i = 0; i < arrr.length; i++) {
            for (int j = 0; j < arrr[i].length; j++) {
                System.out.print(arrr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
