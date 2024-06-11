package week_11.day_1;

public class Student extends Employee {

    // Unique properties
    private String studentId;
    private String graduationDate;
    private String subject;
    private char grade;

    // Constructor
    public Student(
            String firstName,
            String lastName,
            String address,
            String studentId,
            String graduationDate,
            String subject,
            char grade) {
        super(firstName, lastName, address);
        setStudentId(studentId);
        setGraduationDate(graduationDate);
        setSubject(subject);
        setGrade(grade);
    }

    // Getters
    private String getStudentId() {return studentId;}
    private String getGraduationDate() {return graduationDate;}
    private String getSubject() {return subject;}
    private char getGrade() {return grade;}

    // Setters
    private void setStudentId(String studentId) {this.studentId = studentId;}
    private void setGraduationDate(String graduationDate) {this.graduationDate = graduationDate;}
    private void setSubject(String subject) {this.subject = subject;}
    private void setGrade(char grade) {this.grade = grade;}

    // Method to print Student Information
    public void printStudentInfo() {
        System.out.println("StudentId: " + getStudentId());
        System.out.println("First Name: " + getFirstName());
        System.out.println("last Name: " + getLastName());
        System.out.println("Address: " + getAddress());
        System.out.println("Graduation Date: " + getGraduationDate());
        System.out.println("Subject: " + getSubject());
        System.out.println("Grade: " + getGrade());
    }
}
