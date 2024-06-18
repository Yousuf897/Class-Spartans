package week_12.day_1;

public class Student {

    // Getters & Setters they are methods
    private String firstName;
    private static final String className = "Spartans";
    private static int countStudents = 0;

    // Syntax
    // access modifier (optional) return Type name of the method( no parameters required ) {
    //  return this.nameOfYourVariable; nameOfYourVariable;
    // }

    public Student(String firstName ) {
        setFirstName(firstName);
        countStudents++;
    }

    public String getFirstName() {
/*        return this.firstName; */ return firstName;
    }

    // Syntax
    // access modifier (optional) return Type (void) name of the method (prefix of set)( one argument required ) {
    //  firstName = valueComingFromArgument; ( same name as your argument )
        // if the name of your argument is the same name as your variable, use the keyword of this in order to
    // tell the compiler that the left side of the assignment is the variable of the class.
    // }

    private void setFirstName( String firstName ) {
        this.firstName = firstName;
    }

    public void printStudentInfo() {
        System.out.println("FirstName: " + getFirstName() );
    }

    public void printStudentCount() {
        System.out.println("There are " + countStudents + " number of students in class " + className);
    }

}