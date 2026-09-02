package august.day15.three;

public class Main {
    public static void main(String[] args) {

        double gallons, liters;
        int count = 0;

        for (gallons = 1; gallons <= 50; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " галлонов соответствует " + liters + " литрам ");
            count++;
            if (count == 5) {
                System.out.println();
                count = 0;
            }
        }
    }
}
