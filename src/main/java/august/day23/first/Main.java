package august.day23.first;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 2; i <= 100; i++) {
            int count = 0;
            for (int j = 2; j <= 100; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count <= 1) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
