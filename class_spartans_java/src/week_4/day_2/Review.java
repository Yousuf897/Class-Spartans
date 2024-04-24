package week_4.day_2;

public class Review {

    public static void main(String[] args) {

        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  " );

        // Length():
        String message = "Welcome to TekSchool!";
        System.out.println("There are total of " + message.length() + " characters in message." );

        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  " );

        // subString()
        System.out.println( message );
        System.out.println( message.substring(8) );
        System.out.println( message.substring(8, 10) );

        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  " );

        // charAt()
        System.out.println( message.charAt(9) );
        char characterAtIndex = message.charAt(11);
        System.out.println( characterAtIndex );

        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  " );

        // replace()
       message = message.replace("to", "To");
        System.out.println( message );
        message = message.replace('W', 'w');
        System.out.println( message );
        message = message.replaceFirst("welcome", "Welcome Student");
        System.out.println( message );
        message = message.replaceAll("Welcome Student To TekSchool", "Java is easy!");
        System.out.println( message );

        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  " );

        String firstName = "AlExander Eric";
        String subFirstName = firstName.substring(0, 10 );
        System.out.println( subFirstName );
        System.out.println( subFirstName.replace('E', 'e') );

        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  " );

        // toLowerCase()
        System.out.println("Original version of message: " + message );
        System.out.println("Lowercase version of message: " + message.toLowerCase() );

        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  " );

        // toUpperCase()
        System.out.println("Original version of message: " + message );
        System.out.println("Uppercase version of message: " + message.toUpperCase() );

        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  " );

        // trim()
        String lastName = "                  Morphy                                       ";
        System.out.println( lastName );
//        lastName = lastName.trim();
//        System.out.println( lastName );
        System.out.println( lastName.trim() );

        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  " );


    }

}
