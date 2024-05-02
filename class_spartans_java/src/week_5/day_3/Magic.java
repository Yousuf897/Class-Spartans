package week_5.day_3;

import java.util.Scanner;

public class Magic {

    public static void main(String[] args) {
        // Use console and ask user to enter their marks, and set their grade based on marks.
        // print their marks and grade.
        char grade;
        double marks;
        Scanner scnObj = new Scanner(System.in);
        System.out.print("Enter a number between 0 to 100: ");
        marks = scnObj.nextDouble();
        if (marks <= 100 && marks >= 90) {
            grade = 'A';
        } else if (marks < 90 && marks >= 80) {
            grade = 'B';
        } else if (marks < 80 && marks >= 70) {
            grade = 'C';
        }
        else if (marks < 70 && marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Your grade is: " + grade);
    }
}
