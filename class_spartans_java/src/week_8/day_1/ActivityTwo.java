package week_8.day_1;

public class ActivityTwo {

    /*
    *
    * Given a String of message
    *
    * String message = "Learning java is fun!";
    * Using loops. print all characters of this String by using toCharArray()
    *
    * */

    public static void main(String[] args) {

        String message = "Learning java is fun!";
/*        char[] messageCharacters = message.replace(" ", "").toCharArray();

        for ( char eachCharacter : messageCharacters ) {
            System.out.print( eachCharacter + " " );
        }*/

        for (char eachCharacter : message.replace(" ", "").toCharArray()) {
            System.out.print(eachCharacter + " ");
        }

        System.out.println();
        System.out.println(" * * * * * * * * *  ");

        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i) + " ");
        }

        // System.out.print( message.replace(" ", "").charAt(i) ); // Index out of boundaries

        System.out.println();

        // Remove the spaces and modify the message with new values
        message = message.replace(" ", "");

        // Use while loop to capture each character of this String

        int index = 0;
        while ( index < message.length() ) {
            System.out.print( message.charAt(index) + " " );
            index++;
        }

    }
}
