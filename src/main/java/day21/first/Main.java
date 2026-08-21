package day21.first;

public class Main {
    public static void main(String[] args) {

        int a = 10, b = 0;

        if (b != 0 && (a % b == 0)) {  // укороченное и предотвращает деление на ноль
            System.out.println(" b - del first");
        }

        if (b != 0 & (a % b == 0)) {  // полное и не предотвращает
            System.out.println(" b - del second");
        }
    }
}
