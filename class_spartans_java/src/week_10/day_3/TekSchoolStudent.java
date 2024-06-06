package week_10.day_3;


public class TekSchoolStudent extends UserInfo {

    // Variable
    private String course;
    private String certificate;

    // Method to print TekSchool Info
    public void printStudentInfo() {
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("age: " + getAge());
        System.out.println("Date of Birth: " + getDateOfBirth());
        System.out.println("Occupation: " + getOccupation());
        System.out.println("Course: " + getCourse());
        System.out.println("Certification: " + getCertificate());
    }

    // Constructor


    public TekSchoolStudent(int id, String firstName, String lastName, int age, String dateOfBirth, String occupation, String course, String certificate) {
        super(id, firstName, lastName, age, dateOfBirth, occupation);
        this.course = course;
        this.certificate = certificate;
    }

    // Getters
    private String getCourse() {return course;}
    private String getCertificate() {return certificate;}

    // Setters
    private void setCourse(String course) {this.course = course;}
    private void setCertificate(String certificate) {this.certificate = certificate;}
}
