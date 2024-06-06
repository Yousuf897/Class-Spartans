package week_10.day_2;

public class Employee {

    // Variables
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    // Constructor
    public Employee(String firstName, String lastName, String dateOfBirth) {
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);
    }

    // Getters
    private String getFirstName() {return firstName;}
    private String getLastName() {return lastName;}
    private String getDateOfBirth() {return dateOfBirth;}

    // Setters
    private void setFirstName(String firstName) {this.firstName = firstName;}
    private void setLastName(String lastName) {this.lastName = lastName;}
    private void setDateOfBirth(String dateOfBirth) {this.dateOfBirth = dateOfBirth;}

    // Public Method to print emp info
    public void printEmployeeInfo() {
        System.out.println("First Name: " +firstName);
        System.out.println("Last Name: "+ lastName);
        System.out.println("Date of Birth: "+ dateOfBirth);
    }

}
