package week_6.day_3;

public class DiscountExampleTwo {

    public static void main(String[] args) {
        // Variable Declarations
        boolean isMember = true;
        double finalPrice;
        double originalPrice = 100;
        double discountPrice;


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
