package week_10.day_1;
public class Vehicle {

    // Variables
    String companyName;
    String model;
    String trim;
    int numberOfDoors;

    public Vehicle(String companyName, String model, String trim, int numberOfDoors) {
        setCompanyName(companyName);
        setModel(model);
        setTrim(trim);
        setNumberOfDoors(numberOfDoors);
    }

    // Getters
    private String getCompanyName() {return companyName;}
    private String getModel() {return model;}
    private String getTrim() {return trim;}
    private int getNumberOfDoors() {return numberOfDoors;}

    // Setters
    private void setCompanyName(String companyName) {this.companyName = companyName;}
    private void setModel(String model) {this.model = model;}
    private void setTrim(String trim) {this.trim = trim;}
    private void setNumberOfDoors(int numberOfDoors) {this.numberOfDoors = numberOfDoors;}

    // Public Method
    public void printVehicleInformation() {
        System.out.println(" * * * * * Vehicle Information  * * * * * ");
        System.out.println("Vehicle Company: " + companyName);
        System.out.println("Vehicle Model: " + model);
        System.out.println("Vehicle Trim: " + trim);
        System.out.println("Vehicle number of doors: " + numberOfDoors);
    }
}
