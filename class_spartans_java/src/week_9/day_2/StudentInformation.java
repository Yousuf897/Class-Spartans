package week_9.day_2;

public class StudentInformation {

    String firstName;
    String lastName;
    String dateOfBirth;
    String occupation;

    public StudentInformation() {
        firstName = null;
        lastName = null;
        dateOfBirth = null;
        occupation = null;
    }

    public void printStudentInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Date Of Birth: " + dateOfBirth);
        System.out.println("Occupation: " + occupation);
    }

}
