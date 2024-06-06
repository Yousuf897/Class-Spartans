package week_10.day_3;

public class CollegeStudent extends UserInfo {

    // Variables
    private double gpa;
    private String diploma;
    private String[] courses;

    // Constructor
    public CollegeStudent(int id, String firstName, String lastName, int age, String dateOfBirth, String occupation, double gpa, String diploma, String[] courses) {
        super(id, firstName, lastName, age, dateOfBirth, occupation);
        setGpa(gpa);
        setDiploma(diploma);
        setCourses(courses);
    }

    // Method to Print college student info
    public void printCollegeStudentInfo() {
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("age: " + getAge());
        System.out.println("Date of Birth: " + getDateOfBirth());
        System.out.println("Occupation: " + getOccupation());
        System.out.println("GPA: " + getGpa());
        System.out.println("diploma: " + getDiploma());
        printCourses();
    }

    // Method to print elements of array ( Courses )
    private void printCourses() {
        for ( String course : courses ) {
            System.out.println("courses: " + course);
        }
    }

    // Getters
    public double getGpa() {return gpa;}
    public String getDiploma() {return diploma;}
    public String[] getCourses() {return courses;}

    // Setters
    private void setGpa(double gpa) {this.gpa = gpa;}
    private void setDiploma(String diploma) {this.diploma = diploma;}
    private void setCourses(String[] courses) {this.courses = courses;}
}
