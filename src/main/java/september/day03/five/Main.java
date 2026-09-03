package september.day03.five;


/*Задача: С помощью Stream API сделай так, чтобы программа:
Оставила только четные числа.
Каждое оставшееся число умножила на 10.
Собрала результат в новый список (List<Integer>)*/

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

       List<Integer> newList =  numbers
               .stream()
               .filter(x -> x % 2 == 0)
               .map(x -> x * 10)
               .collect(Collectors.toList());

        System.out.println(newList);
    }
}
