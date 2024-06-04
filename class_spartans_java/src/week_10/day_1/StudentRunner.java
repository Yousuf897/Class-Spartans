package week_10.day_1;

public class StudentRunner {

    static String firstName;

    public static void main(String[] args) {
        // AAA --> Arrange, Act, Assert
        // Arrange
        // Create Objects
        Student stdObj = new Student(10, "John", "Alexander", "05/12/1993"); // Student one Object
        Student stdTwoObj = new Student(20, "Hameed", "Attayi", "05/25/1973"); // Student Two Object
        // Action --> Print the information of firstStudent
        stdObj.printStudentInformation();
        // Action --> Print the information of secondStudent
        stdTwoObj.printStudentInformation();

    }
}
