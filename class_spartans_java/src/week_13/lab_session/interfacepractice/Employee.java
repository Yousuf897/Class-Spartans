package week_13.lab_session.interfacepractice;  // Defines the package where this class belongs

// Class declaration named Employee, which extends GeneralInformation and implements EmployeeInterface
public class Employee extends GeneralInformation implements EmployeeInterface {

    // Private instance variables
    private double salary;     // Stores the salary of the employee
    private double hourlyRate; // Stores the hourly rate of the employee

    // Constructor
    public Employee(String firstName, String lastName, String dateOfBirth, String occupation) {
        super(firstName, lastName, dateOfBirth, occupation);  // Calls the constructor of superclass GeneralInformation
    }

    // Overridden method from EmployeeInterface
    @Override
    public void printEmployeeInfo() {
        // Prints employee information
        System.out.println("Employee firstName: " + getFirstName());
        System.out.println("Employee lastName: " + getLastName());
        System.out.println("Employee date of birth: " + getDateOfBirth());
        System.out.println("Employee occupation: " + getOccupation());
    }

    // Overridden method from EmployeeInterface
    @Override
    public double calculateSalary() {
        return salary;  // Returns the stored salary of the employee
    }
}
