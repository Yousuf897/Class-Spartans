package week_11.day_1;

public class BMW extends Vehicle {

    // Unique Properties
    private String crystalLights;
    private String engine;

    // Constructor


    public BMW(String companyName, int numberOfDoors, String model, String year, String trim, String crystalLights, String engine) {
        super(companyName, numberOfDoors, model, year, trim);
        setCrystalLights(crystalLights);
        setEngine(engine);
    }

    // Getters
    public String getCrystalLights() {return crystalLights;}
    public String getEngine() {return engine;}

    // Setters
    private void setCrystalLights(String crystalLights) {this.crystalLights = crystalLights;}
    private void setEngine(String engine) {this.engine = engine;}


    // public method to print BMW info
    public void printBMWInfo() {
        System.out.println("Company Name: " + getCompanyName());
        System.out.println("Model: " + getModel());
        System.out.println("Trim: " + getTrim());
        System.out.println("Year: " + getYear());
        System.out.println("Number of doors: " + getNumberOfDoors());
        System.out.println("Lights: " + getCrystalLights());
        System.out.println("Engine Type: " + getEngine());
    }




}
