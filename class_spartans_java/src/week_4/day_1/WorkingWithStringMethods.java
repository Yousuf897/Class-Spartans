package week_4.day_1;

public class WorkingWithStringMethods {

    // String Methods:
    // Length(): --> Return the length of your string. (including spaces)
    // subString(): --> Print pieces of string. You have to pass start Index and end Index.
    // charAt(): --> Will return specific character stored in a specific index. (Index = Address)
    // replace(): --> Will replace the object with another. will take two arguments, the word in which
    // you want to replace it with something and the replacement.
    // toLowerCase(): Return the lower case version of your String.
    // toUpperCase(): Return the upper case version of your String.
    // trim(): Remove the spaces before and after your String.
    // indexOf(): Returns the index of specific character
    // contains(): Returns true or false if a specific string is available.
    // equals(): Compares the actual values of String rather than their reference.

    // NOTE: How to get the last index of a message?? --> Use N - 1 formula.
    // Where N is the total length of your message. so if we say length() - 1 it will give us
    // the index of last character or simply the last index.




    public static void main(String[] args) {

        String message = "is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting," +
                " remaining essentially unchanged. It was popularised in the 1960s with the release of " +
                "Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing " +
                "software like Aldus PageMaker including versions of Lorem Ipsum.";

        System.out.println("5 Characters.");

        // Syntax of calling built-in methods
        // variableName.methodName();
        System.out.println( message.length() );


        System.out.println(" * * * * *  * * * * *  * * * * *  * * * * *  * * * * * ");

        String fullName = "Eric Morphy";

        System.out.println( fullName );
        System.out.println( fullName.length() );
        System.out.println( fullName.charAt(1) );
        System.out.println( fullName.charAt(3) );
        int lastIndex = fullName.length() - 1; // 10
        System.out.println( fullName.length() - 1 ); // 10

        System.out.println( fullName.charAt( fullName.length() - 1 ) );
        System.out.println( message.charAt( message.length() - 1 ) );
        System.out.println( message.length() - 1 ); // Length() - 1 returns the last index.

    }
}
