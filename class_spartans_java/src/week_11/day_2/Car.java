package week_11.day_2;

public class Car extends Vehicle {

    int numberOfDoors;
    String color;

    public Car(String companyName, int numberOfDoors, String color) {
        super(companyName);
        this.numberOfDoors = numberOfDoors;
        this.color = color;
    }

    public void stop() {
        System.out.println("Car Stopped!");
    }

}
