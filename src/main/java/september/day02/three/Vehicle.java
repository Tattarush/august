package september.day02.three;

public class Vehicle {

    int passengers;
    int fuelcap;
    int mpg;

    int range() {
        return fuelcap * mpg;
    }

    double fuelNeeded(int range) {
        return (double) range / mpg;
    }

}
