package week_13.day_1;

public class BMW {

    private  final String companyName;
    private  final String model;
    private final int maxSpeed;
    private final String trim;
    private static final int numberOfTypes = 5;

    // Constructor
    public BMW(String model, int maxSpeed, String trim) {
        this.companyName = "BMW";
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.trim = trim;
    }

    public void printVehicleInfo() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Trim: " + trim);
        System.out.println("number of types: " + numberOfTypes);
       // numberOfTypes = 7; // Cannot modify the value of final variable!
    }



}
