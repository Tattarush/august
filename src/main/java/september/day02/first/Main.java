package september.day02.first;

public class Main {
    public static void main(String[] args) {

        int range1 , range2;

        Vehicle minivan = new Vehicle();

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        range1 = minivan.fuelcap * minivan.mpg;

        Vehicle sportcar = new Vehicle();

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        range2 = sportcar.fuelcap * sportcar.mpg;

        System.out.println("Минивен может перевезти " + minivan.passengers + " пассажиров на " + range1 + " миль");
        System.out.println("Спорткар может перевезти " + sportcar.passengers + " пассажиров на " + range2 + " миль");

    }
}



