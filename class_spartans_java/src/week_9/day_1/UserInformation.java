package week_9.day_1;

public class UserInformation {

    // Create a class to store the following user information
     int id;
     String firstName;
     String lastName;
     char gender;
     String dateOfBirth;
     String occupation;

    // Create a method which is going to print userInformation
    public void printUserInformation() {
        System.out.println("User ID: " + id);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("occupation: " + occupation);
    }

    @Override
    public String toString() {
        return "UserInformation{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    // Create amn object of this class and print the details or the information of
    // minimum two students!

}
