package week_9.day_2;

public class Employee {

    // First Employee
    private String firstName;
    private String lastName;

    public void printEmployeeInformation() {
        System.out.println( "First Name: " + getFirstName() );
        System.out.println( "Last Name: " + lastName );
    }

    // Getters & Setters
    public String getFirstName() {
        return firstName;
    }

    // Setters
    public void setFirstName( String newFirstName ) {
        firstName = newFirstName;
    }


}
