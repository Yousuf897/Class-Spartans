package week_5.lab_session;

import java.util.Scanner;

public class AreaOfRectangle {

    // // 3. Write a program that calculates the area of a rectangle given its length and width.

    public static void main(String[] args) {

        // Declare three variables
        double width, length, area;

        // Object of scanner in order to get the input of user
        var scnObj = new  Scanner(System.in);

        // Print and get the data from the user
        System.out.print( "Please enter the length of the rectangle: " );
        length = scnObj.nextDouble();

        System.out.print( "Please enter the width of the rectangle: " );
        width = scnObj.nextDouble();

        // Calculate the area of the rectangle
        area = length * width;

        // Print the area of the rectangle
        System.out.println("The area of the rectangle with length of " + length + " and width of " + width
        + " is = " + (int) area);


    }

}
