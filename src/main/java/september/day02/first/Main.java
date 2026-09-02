package september.day02.first;

public class Main {
    public static void main(String[] args) {

        int range;

        Vehicle minivan = new Vehicle();

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        range = minivan.fuelcap * minivan.mpg;

        System.out.println("Минивен может перевезти "+ minivan.passengers+ " пассажиров на "+ range + " миль");
    }
}



