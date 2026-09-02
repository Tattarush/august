package september.day02.three;

public class Main {
    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        Vehicle sportcar = new Vehicle();

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;



        System.out.println("Минивен может перевезти " + minivan.passengers + " пассажиров ");
        minivan.range();
        System.out.println("Спорткар может перевезти " + sportcar.passengers + " пассажиров ");
        sportcar.range();

    }
}
