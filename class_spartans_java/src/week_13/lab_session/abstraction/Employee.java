package week_13.lab_session.abstraction;

public class Employee {

    // Fields, attributes, variables
    private String firstName;
    private String lastName;
    private int age;
    private String occupation;

    // Constructor
    public Employee( String firstName, String lastName, int age, String occupation ) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setOccupation(occupation);
    }

    // Getters
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public int getAge() {return age;}
    public String getOccupation() {return occupation;}

    // Setters
    private void setFirstName( String firstName ) {
        if ( firstName == null || firstName.equals(" ") )
            throw new IllegalArgumentException("FirstName cannot be null or cannot be empty");
        this.firstName = firstName;
    }
    private void setLastName(String lastName) {this.lastName = lastName;}
    private void setAge(int age) {
        if ( age < 18 )
            throw new IllegalArgumentException("Age cannot be less than 18");
        this.age = age;
    }
    private void setOccupation(String occupation) {this.occupation = occupation;}

    // Method to print the employee information
    public void printInfo() {
        System.out.println("Employee FirstName: " + getFirstName());
        System.out.println("Employee LastName: " + getLastName());
        System.out.println("Employee age: " + getAge());
        System.out.println("Employee Occupation: " + getOccupation());
    }

}
