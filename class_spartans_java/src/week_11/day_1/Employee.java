package week_11.day_1;

public class Employee {

    // Attributes --> Variables --> Fields
    private String firstName;
    private String lastName;
    private String address;

    // Unique Properties
    private double salary;
    private String startDate;
    private String endDate;
    private String position;

    // Constructor
    public Employee( String firstName, String lastName, String address ) {
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
    }

    // Functions --> Methods
    private void printEmployeeInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }

    // Getters
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getAddress() {return address;}

    // Getters for Unique Properties
    private double getSalary() {return salary;}
    private String getStartDate() {return startDate;}
    private String getEndDate() {return endDate;}
    private String getPosition() {return position;}

    // Setters
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setAddress(String address) {this.address = address;}

    // Setters for Unique Properties
    private void setSalary(double salary) {this.salary = salary;}
    private void setStartDate(String startDate) {this.startDate = startDate;}
    private void setEndDate(String endDate) {this.endDate = endDate;}
    private void setPosition(String position) {this.position = position;}
}
