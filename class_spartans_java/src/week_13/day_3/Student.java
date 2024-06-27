package week_13.day_3;

public class Student {

    // Fields to store the information
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    // One Field which is shared among all objects and the value is the same and final
    static final String className = "Spartans";

    // Constructor
    public Student(String firstName, String lastName, String dateOfBirth) {
       setFirstName(firstName);
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    private void setFirstName( String firstName ) {
        this.firstName = firstName;
    }

    // Method to print the information of the student
    public void printInfo() {
        System.out.println("FirstName: " + getFirstName());
        System.out.println("LastName: " + lastName);
        System.out.println("DateOfBirth: " + dateOfBirth);
        System.out.println("ClasName: " + className);
    }


}
