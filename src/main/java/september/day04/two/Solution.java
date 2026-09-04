package september.day04.two;

import java.util.List;

public class Solution {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 3, 4, 5, 6, 7);

        int r = list.stream()
                .reduce(0, (acc, x) -> acc + x);

        System.out.println(r);
    }
}
