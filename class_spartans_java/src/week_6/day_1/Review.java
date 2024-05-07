package week_6.day_1;

public class Review {

    public static void main(String[] args) {

        String className = "Transformers";

        // Condition based on className using if statement
        if ( className.equals("Spartans") ) {
            System.out.println("Welcome Spartans");
        }

        // Condition based on className using switch statement

        switch ( className ) {
            case "Spartans":
                System.out.println("Welcome Spartans");
                break;
            case "titans":
                System.out.println("Welcome titans");
                break;
            default:
                System.out.println("Default message");
        }

        System.out.println("😊😊");

    }

}
