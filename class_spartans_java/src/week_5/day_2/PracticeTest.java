package week_5.day_2;

import java.util.Scanner;

public class PracticeTest {

    public static void main(String[] args) {

        char firstCharacterOfFirstName;
        String lastName;
        Scanner scnObj = new Scanner(System.in);

        System.out.println("Enter your firstName: ");
        firstCharacterOfFirstName = scnObj.next().charAt(0);

        System.out.println("Enter your lastName: ");
        lastName = scnObj.next();

        System.out.println("The first character of your name is: " + firstCharacterOfFirstName);
        System.out.println("Full firstName: ");
        System.out.println("The first character of your last name is: " + lastName.toLowerCase().charAt(0));
        System.out.println("Your full lastName: " + lastName);

        // (703) - 000 - 1200 --> String
        // 7030001200 -->  Int --> "7030001200"
        // double


    }

}
