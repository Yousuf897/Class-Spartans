package week_6.day_1;

public class ConditionalStatementActivityThree {

    /*

    Question: Favorite Color Picker
    You have two color options: String color1 = "Red"; and String color2 = "Blue";.
    You like the color "Red" more than "Blue".
    Using the conditional operator, determine which color is your favorite.
    Store your favorite color in a variable called favoriteColor.
    Print out your favorite color. What is the color?

*/

    public static void main(String[] args) {

        String color1 = "Red";
        String color2 = "Blue";

        String favoriteColor;

        favoriteColor = (color1.equals("Red") ? color1 : color2);
        // favoriteColor = ("Red".equals("Blue") ? color2 : color1);
        System.out.println("Favorite color: " + favoriteColor);

        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * * " );

        // Using if statement
        if ( color1.equals(color2 ) ) {
            favoriteColor = color2;
        } else {
            favoriteColor = color1;
        }

        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * * " );

        // Using switch statement

        switch ( color1 ) {
            case "Red":
                favoriteColor = color1;
                break;
            case "Blue":
                favoriteColor = color2;
                break;
        }

    }

}
