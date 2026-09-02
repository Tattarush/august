package september.day02.three;

public class Main {
    public static void main(String[] args) {

        Vehicle minivan = new Vehicle(7,16,21);


        Vehicle sportcar = new Vehicle(2, 14, 12);



        System.out.println("Минивен может перевезти " + minivan.passengers + " пассажиров " + "на расстояние - "+ minivan.range());

        System.out.println("Спорткар может перевезти " + sportcar.passengers + " пассажиров "+ "на расстояние - "+ sportcar.range());

        System.out.println("Для поездки на 252 миль минивену требуется - "+minivan.fuelNeeded(252)+" топлива");
    }
}
