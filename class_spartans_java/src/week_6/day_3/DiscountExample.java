package week_6.day_3;

import java.util.Scanner;

public class DiscountExample {

    /*
    4. Ternary Operator:
    In an online store, if a user is a member, they get a 10% discount.
    Given the original price of an item and a boolean isMember, calculate and display the final price
    using the ternary operator.

*/

    public static void main(String[] args) {

        // Variable Declarations
        boolean isMember = false;
        double finalPrice;
        double originalPrice;
        int userChoice;
        double discountPrice;

        // Object of Scanner
        var scnObj = new Scanner(System.in);

        System.out.print("Please enter the original price of the item: ");
        originalPrice = scnObj.nextDouble();

        System.out.println();

        System.out.println(" * * * * * * * * * * MENU * * * * * * * * * * ");
        System.out.println("Are you a member of our online store: ");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println("3. Exit");
        System.out.print("Your selection: ");
        userChoice = scnObj.nextInt();

        switch ( userChoice ) {
            case 1:
                isMember = true;
                break;
            case 2:
                isMember = false;
                break;
            case 3:
                System.out.println("Thank you!");
                scnObj.close();
                break;
            default:
                System.out.println("Invalid choice, please re-enter!");
        }

        // Calculate the final price using ternary operator
        finalPrice = ( isMember ) ? originalPrice - ( originalPrice * 0.1 ) : originalPrice;

        // Calculate the discount price
        discountPrice = originalPrice - finalPrice;

        // Print the final price to user
        if ( isMember == false ) {
            System.out.println("Final Price: " + finalPrice);
        } else {
            System.out.println("Dear user, your original price was " + originalPrice + " we have given you" +
                    " 10% discount, and your final price is: " + finalPrice);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("You've saved $" + discountPrice + " by being a member, thank you for being a member!");
        }

    }

}
