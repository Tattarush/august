package september.day04.three;

public class Main {
    public static void main(String[] args) {


        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);

        char ch;

        for (int i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }

        System.out.println("Содержимое очереди bigQ - ");
        for (int i = 0; i < 26; i++) {
            ch = bigQ.get();
            if(ch != (char) 0){
                System.out.print(ch + " ");
            }else {
                System.out.println();}
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print("Попытка сохранения - " + (char) ('Z' - i));
            System.out.println();
            smallQ.put((char) ('Z' - i));

        }

        System.out.println();

        System.out.println("Содержимое очереди smallQ - ");
        for (int i = 0; i < 4; i++) {
            ch = smallQ.get();
            if(ch != (char) 0) System.out.print(ch+ " ");
        }
    }
}
