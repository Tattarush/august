package september.day02.three;

public class Vehicle {

    int passengers;
    int fuelcap;
    int mpg;

    void range() {
        System.out.println("Дальность - "+ fuelcap * mpg);
    }
}
