package week_6.day_1;

public class ActivityOne {

    /*
    * 1. Basic Decision Making:
        You are creating a weather application. Based on the temperature, suggest what to wear.
        * If the temperature is below 10 degrees, display "Wear a heavy coat!".
        * If it's between 10 and 20 degrees, suggest "A light jacket will do.".
        * Otherwise, for any temperature above 20 degrees, show "It's warm, just a T-shirt is fine!".
    * */

    public static void main(String[] args) {


        int temperature = 50;

        if ( temperature < 10 ) {
            System.out.println( "Wear a heavy coat!");
        } else if ( temperature >= 10 && temperature <= 20) {
            System.out.println("A light jacket will do.");
        } else {
            System.out.println("It's warm, just a T-shirt is fine!");
        }

    }

}
