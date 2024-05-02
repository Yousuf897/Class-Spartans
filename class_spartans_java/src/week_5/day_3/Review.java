package week_5.day_3;
import java.util.Scanner;

public class Review {

    public static void main(String[] args) {

        // Object
        Scanner scnObj = new Scanner(System.in);

        // Variables
        String firstName;
        String lastName;
        String dateOfBirth;
        int choice;

        System.out.print("Enter your first Name: ");
        firstName = scnObj.next();

        System.out.print("Enter your last Name: ");
        lastName = scnObj.next();

        System.out.print("Enter your date of birth: ");
        dateOfBirth = scnObj.next();


        System.out.println("FirstName: " + firstName);
        System.out.println("LastName: " + lastName);
        System.out.println("DateOfBirth: " + dateOfBirth);






    }

}
