package september.day02.two;

public class Main {
    public static void main(String[] args) {

        Vehicle car1 = new Vehicle();
        car1.num = 1;
        Vehicle car2 = car1;

        System.out.println(car1.num);
        System.out.println(car2.num);
        System.out.println("---------------------");
        car2.num = 2;

        System.out.println(car1.num);
        System.out.println(car2.num);
    }
}
