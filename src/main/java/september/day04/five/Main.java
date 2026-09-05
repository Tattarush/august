package september.day04.five;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = List.of(5, 12, 3, 8);

        int max = list.stream()
                .reduce(Integer.MIN_VALUE, (acc, x) -> x > acc ? x : acc);
        System.out.println(max);


        List<String> words = List.of("Красный", "Желтый", "Зеленый");

        String str = words.stream()
                .reduce((acc, word) -> acc + " - " + word)
                .orElse("");
        System.out.println(str);
    }
}
