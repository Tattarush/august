package day30.first;

/*Код ASCII символов нижнего регистра отличается от кода соответствующих символов
верхнего регистра на величину 32. Следовательно, для преобразования
строчной буквы в прописную нужно уменьшить ее код на 32. Используйте это обстоятельство
для написания программы, осуществляющей получение символов с
клавиатуры. При выводе результатов данная программа должна преобразовывать
строчные буквы в прописные, а прописные - в строчные. Остальные символы не
должны изменяться. Работа программы должна завершаться после того, как пользователь
введет с клавиатуры точку. И наконец, сделайте так, чтобы программа
отображала число символов, для которых бьш изменен регистр.*/


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException{
        List<Character> list = new ArrayList<>();
        int count = 0;
        char ch;
        System.out.println("Введите набор символов - ");
        do {
            ch = (char) System.in.read();
            if (ch >= 65 && ch <= 90) {
                ch += 32;
                count++;
            }else if (ch >= 97 && ch <= 122) {
                ch -= 32;
                count++;
            }

            if (ch != 10 && ch != 13) {
                list.add(ch);
            }
        } while (ch != '.');

        StringBuilder sb = new StringBuilder();

        for (Character cr : list) {
            sb.append(cr);

        }
        System.out.println("Измененная введенная фраза " + sb);
        System.out.println("Количество измененных символов - "+ count);
    }
}
