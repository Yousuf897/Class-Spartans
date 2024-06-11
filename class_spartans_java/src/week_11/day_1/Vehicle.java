package week_11.day_1;

public class Vehicle {

    // Public Properties
    private String companyName;
    private int numberOfDoors;
    private String model;
    private String year;
    private String trim;

    // Constructor

    public Vehicle(String companyName, int numberOfDoors, String model, String year, String trim) {
        setCompanyName(companyName);
        setNumberOfDoors(numberOfDoors);
        setModel(model);
        setYear(year);
        setTrim(trim);
    }

    // Getters
    public String getCompanyName() {return companyName;}
    public int getNumberOfDoors() {return numberOfDoors;}
    public String getModel() {return model;}
    public String getYear() {return year;}
    public String getTrim() {return trim;}

    // Setters
    private void setCompanyName(String companyName) {this.companyName = companyName;}
    private void setNumberOfDoors(int numberOfDoors) {this.numberOfDoors = numberOfDoors;}
    private void setModel(String model) {this.model = model;}
    private void setYear(String year) {this.year = year;}
    private void setTrim(String trim) {this.trim = trim;}


    // Public method to print vehicle info
}
