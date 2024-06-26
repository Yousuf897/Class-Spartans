package week_13.day_2.interfacetopic;

public class Student implements Spartans, TekSchool {

    // Fields
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    // Constructor
    public Student(String firstName, String lastName, String dateOfBirth) {
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

    @Override
    public void printStudentInfo() {
        System.out.println("FirstName: " + getFirstName());
        System.out.println("lastName: " + getLastName());
        System.out.println("Date of Birth: " + getDateOfBirth());
        System.out.println("ClassName: " + className);
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
    }
}
