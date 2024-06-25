package week_13.day_1;

public class Vehicle {

    String companyName;
    int maxSpeed;
    int numberOfDoors;
    String model;

    public Vehicle(String model, int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void printMaxSpeed() {
        System.out.println("Vehicle maxSpeed: " + maxSpeed);
    }

}
