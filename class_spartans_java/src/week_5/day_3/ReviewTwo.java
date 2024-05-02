package week_5.day_3;

import java.util.Scanner;

public class ReviewTwo {

    public static void main(String[] args) {

        // Object
        Scanner scnObj = new Scanner(System.in);

//        int choice;
        String choice;
        boolean yesOrNo;

        /*
         * 1. Yes
         * 2. No
         * Enter: 1
         * */

        System.out.println("Please select one of the options below: ");
        System.out.println("1. Yes ");
        System.out.println("2. No ");
        System.out.print("Enter your choice: ");
//        choice = scnObj.nextInt();
        choice = scnObj.next();

 /*       if ( choice == 1 ) {
            yesOrNo = true;
        } else {
            yesOrNo = false;
        }

        System.out.println( yesOrNo );*/

        if ( choice.equals("Yes") ) {
            yesOrNo = true;
        } else {
            yesOrNo = false;
        }

        System.out.println( yesOrNo );


    }

}
