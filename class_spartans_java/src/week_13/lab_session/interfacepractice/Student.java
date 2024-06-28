package week_13.lab_session.interfacepractice;  // Defines the package where this class belongs

// Class declaration named Student, which extends GeneralInformation and implements SpartansClass interface
public class Student extends GeneralInformation implements SpartansClass {

    // Constructor
    public Student(String firstName, String lastName, String dateOfBirth, String occupation) {
        super(firstName, lastName, dateOfBirth, occupation);  // Calls the constructor of superclass GeneralInformation
    }

    // Overridden method from SpartansClass interface
    @Override
    public void printInfo() {
        // Prints student information
        System.out.println("Student firstName: " + getFirstName());
        System.out.println("Student lastName: " + getLastName());
        System.out.println("Student dateOfBirth: " + getDateOfBirth());
        System.out.println("Student occupation: " + getOccupation());

        // Prints information from SpartansClass interface
        System.out.println("Class Name: " + className);
        System.out.println("Class startTime: " + startTime);
        System.out.println("Class endTime: " + endTime);
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Number of Sessions: " + numberOfJavaSession);
        System.out.println("Java schedule: " + javaSchedule);
    }
}
