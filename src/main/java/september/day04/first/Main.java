package september.day04.first;

/*Задача: С помощью Stream API напиши цепочку, которая:
Удалит все дубликаты.
Отсортирует детали по алфавиту (метод sorted() без параметров сортирует строки по алфавиту сам).
Оставит только первые 3 детали из отсортированного списка.
Выведет каждую из этих трех деталей в консоль с новой строки (используй терминальный метод forEach).
* */

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> details = List.of("Винт", "Гайка", "Винт", "Шайба", "Гайка", "Болт");

        details.stream()
                .distinct()
                .sorted()
                .limit(3)
                .forEach(System.out::println);

    }
}
