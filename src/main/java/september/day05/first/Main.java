package september.day05.first;

public class Main {
    public static void main(String[] args) {

        String str1 = "Строки и операции над ними";
        String str2 = str1;
        String str3 = "Еще строка";

        System.out.println(str1.equals(str2));
        System.out.println(str1.length());

        char ch = str1.charAt(3);
        System.out.println(ch);
        System.out.println(str1.compareTo(str3));

        String str4 = "о";

        System.out.println(str1.indexOf(str4));
        System.out.println(str1.indexOf('и'));

        String cut = str1.substring(0, 10);
        System.out.println(cut);

        String str5 = "      обрезка       ";
        System.out.println(str5);
        System.out.println(str5.trim());

        String str6 = "no ok";
        switch (str6) {
            case "ok" -> System.out.println("otlichno");
            case "no ok" -> System.out.println("aaaaaaaaaaa");
            default -> System.out.println("not command");
        }

    }
}
