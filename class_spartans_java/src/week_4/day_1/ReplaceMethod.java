package week_4.day_1;

public class ReplaceMethod {

    // replace(): --> Will replace the object with another. will take two arguments, the word in which
    // you want to replace it with something and the replacement.

    public static void main(String[] args) {

        String message = "Hello World";
        String javaMessage = "Java is easy";

        System.out.println( message );

        // Syntax of calling String methods
        // nameOfVariable.method();

        // Takes one word and will replace it with another!
        message = message.replace("Hello", "Welcome");
        System.out.println( message );

        // The updated value of message right now is "Welcome World".

        // You can pass the old character and replace it with a new character.
        // So previously we had "Welcome World" as the value of the message (variable)
        // below we said wherever you see W, replace it with I.
        message = message.replace('W', 'I');
        System.out.println( message );

        System.out.println(javaMessage);
        javaMessage = javaMessage.replaceAll("Java is easy", "Welcome to Java CLass, Java is not easy!");
        System.out.println( javaMessage );


        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * *  " );

        // Remove spaces between words in a String.
        System.out.println( javaMessage.replaceAll(" ", "") );
        System.out.println( javaMessage );


    }
}
