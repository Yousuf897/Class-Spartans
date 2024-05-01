package week_5.day_2;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        // NameOfClass nameOfObj = new nameOfClass( resources );
        Scanner scnObj = new Scanner( System.in );

        String firstName;
        String lastName;
        int age;

        System.out.print("Please enter your firstName: ");
        firstName = scnObj.next();  // next();, nextLine();

        System.out.print("Please enter your lastName: ");
        lastName = scnObj.next();

        System.out.print("Please enter your age: ");
        age = scnObj.nextInt();

        System.out.println("Your firstName is: " + firstName);
        System.out.println("Your lastName is: " + lastName);
        System.out.println("Your age is: " + age);

        System.out.println( " * * * * *   * * * * *  * * * * *  * * * * * " );

        System.out.println( "FirstName: " + firstName + " LastName: " + lastName + " age: " + age );


//        char character;
//        character =  scnObj.next(); // next();
//        character =  scnObj.nextLine(); // nextLine();



    }

}
