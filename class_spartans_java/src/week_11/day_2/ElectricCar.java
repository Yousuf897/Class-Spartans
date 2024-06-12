package week_11.day_2;

public class ElectricCar extends Car {

    public ElectricCar(String companyName, int numberOfDoors, String color) {
        super(companyName, numberOfDoors, color);
    }

    public void chargeBattery() {
        System.out.println("Charging Battery!");
    }

    public void printElectricCarInfo() {
        System.out.println("ElectricCar{" +
                "companyName='" + companyName + '\'' +
                ", color='" + color + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}');
    }
}
