package week_5.day_3;

import java.util.Scanner;

public class CalculateGrade {

    public static void main(String[] args) {

        char grade;
        double marks;
        Scanner scnObj = new Scanner(System.in);

        System.out.print("Enter a number between 0 to 100: ");
        marks = scnObj.nextDouble();

     /*   if ( marks <= 100 && marks >= 90 ) {
            grade = 'A';
        } else if ( marks <= 89 && marks >= 81 ) {
            grade = 'B';
        } else if ( marks <= 80 && marks >= 71) {
            grade = 'C';
        } *//*else if ( marks > 100) {
            System.out.println("Please enter a number between 70 to 100");
        }*//* else {
            grade = 'F';
        }*/

        if ( marks > 100 || marks < 0) {
            System.out.println( "Marks cannot be more than 100 or less than 0" );
        } else {

            if (marks >= 90) {
                grade = 'A';
            } else if (marks >= 81) {
                grade = 'B';
            } else if (marks >= 70) {
                grade = 'C';
            } else {
                grade = 'F';
            }
            System.out.println("Grade: " + grade + " Marks: " + marks);
        }





    }

}