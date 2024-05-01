package week_5.day_2;

public class IfStatementActivityFour {

    /*
    Question 2: Weather Decisions

    1. Declare three boolean variables: isRaining, hasUmbrella, and isWindy.
    Assign any values of your choice to these variables.
    Write a condition to determine if you should go out or stay indoors. What is the result based on your values?
    Using the same variables, determine if you should take an umbrella when going out. Which conditions
    influenced your decision?
    Finally, decide if you should wear a windbreaker based on the given conditions.
*/

    public static void main(String[] args) {

        boolean isRaining = false;
        boolean hasUmbrella = true;
        boolean isWindy = false;

        // First condition
        if ( isRaining ) {
            System.out.println("Don't go out!");
        } else {
            System.out.println("You can go outside!");
        }

        // Second condition
        if ( hasUmbrella ) {
            System.out.println("You can go!");
        } else {
            System.out.println("No, You cannot go outside!");
        }

        // Third condition
        if ( isWindy ) {
            System.out.println("Wear windbreaker!");
        } else {
            System.out.println("No need to wear windbreaker!");
        }

    }

}
