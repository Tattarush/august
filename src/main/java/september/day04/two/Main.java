package september.day04.two;

/*Задача: С помощью Stream API напиши цепочку, которая:
Оставит только те слова, длина которых строго больше 3 символов (у строки длину можно узнать через .length()).
Посчитает количество таких слов.
Сохранит этот результат в переменную типа long*/


import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> words = List.of("дом", "окно", "программирование", "java", "код", "стрим");

        long y = words.stream()
                .filter(x -> x.length() > 3)
                .count();
        System.out.println(y);
    }
}
