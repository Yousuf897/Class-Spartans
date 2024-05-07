package week_6.day_1;

import java.util.Scanner;

public class SwitchStatementActivityOne {

    /*
     *
     * Monday        -- 1
     * Tuesday       -- 2
     * Wednesday     -- 3
     * Thursday      -- 4
     * Friday        -- 5
     * Saturday      -- 6
     * Sunday        -- 7
     *
     * */

    public static void main(String[] args) {

        // Variable to store userInput
        int userInput;

        // Object of scanner
        var scnObj = new Scanner(System.in);

        // Prompt the user to enter a number:
        System.out.print("Enter a numbet between 1 to 7: ");
        userInput = scnObj.nextInt();

        switch ( userInput ) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid entry, please enter the number again!");
        }

    }


}
