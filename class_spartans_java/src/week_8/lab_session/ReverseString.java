package week_8.lab_session;

public class ReverseString {

    public static void main(String[] args) {

        // Given String
        String message = "Welcome to TekSchool";
        String reversedMessage = "";

        // Reverse the String using loops
        for ( int index = message.length() - 1; index >= 0; index-- ) {
            // How to get a character from a specific index
            // nameOfYourStringVariable.charAt(index);
         /*   reversedMessage =  reversedMessage + message.charAt(index);*/
            // Or
            reversedMessage += message.charAt(index);
        }

        System.out.println("Original Value: " + message );
        System.out.println("Reversed Version: " + reversedMessage );

        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  * * * * *  * * * * *  " );

        // Create object of either StringBuilder or
        var strBuilder = new StringBuilder(message);
        System.out.println( strBuilder.reverse() );

        // StringBuffer
        var strBuffer = new StringBuffer(message);
        System.out.println( strBuffer.reverse() );


    }

}
