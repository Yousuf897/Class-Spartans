package week_10.day_3;

public class UserInfo {

    // Variables
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String dateOfBirth;
    private String occupation;

    // Constructor
    public UserInfo(int id, String firstName, String lastName, int age, String dateOfBirth, String occupation) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setDateOfBirth(dateOfBirth);
        setOccupation(occupation);
    }

    // Method to print ClassA Information
    public void printUserInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("age: " + age);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Occupation: " + occupation);
    }

    // Getters
    public int getId() {return id;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public int getAge() {return age;}
    public String getDateOfBirth() {return dateOfBirth;}
    public String getOccupation() {return occupation;}

    // Setters
    private void setId(int id) {this.id = id;}
    private void setFirstName(String firstName) {this.firstName = firstName;}
    private void setLastName(String lastName) {this.lastName = lastName;}
    private void setAge(int age) {this.age = age;}
    private void setDateOfBirth(String dateOfBirth) {this.dateOfBirth = dateOfBirth;}
    private void setOccupation(String occupation) {this.occupation = occupation;}
}
