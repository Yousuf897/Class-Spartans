package week_4.day_1;

public class ReplaceActivity {


    // Given a String firstName = "Alexander Morphy"
    // 1: Replace "Alexander" with "Erin".
    // 2: Replace "Morphy" with "Curreto";
    // 3: Replace "Erin Curreto" with "John Doe"
    // 4: Remove the space between "John" and "Doe" --> Expected Result should be:
    // JohnDoe

    // 5: Print the length of firstName.

    public static void main(String[] args) {

        String firstName = "Alexander Morphy";

        System.out.println( firstName );

        firstName = firstName.replace("Alexander", "Erin");
        System.out.println( firstName );

        // Task 02:
        firstName = firstName.replace("Morphy", "Curreto");
        System.out.println( firstName );

        // Task 03:
        firstName = firstName.replaceAll("Erin Curreto", "John Doe");
        System.out.println( firstName );

        // Task 04:
        firstName = firstName.replaceAll(" ", "");
        System.out.println( firstName );

        // Task 05:
        System.out.println( firstName.length() );


    }

}
