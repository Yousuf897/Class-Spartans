package week_12.lab_session.findandcountduplicatecharactersinstring;

public class Main {

    // String message = "Hello World"
    // Design a method which will expect a string and a character to look for in a string
    // and return the number occurrence of the character in the string.

    public static void main(String[] args) {
        System.out.println( countSpecificCharacterInString("Hello World", 'l') );
        System.out.println( countSpecificCharacterInString("Hello World", 'l') );
    }

    /** Static Method to search of specific character and return the number occurrence in the String
     * @param character as a value to search
     * @param message character to look for
     * @return and integer number, which is the number of occurrence of character in string
     */
    public static int countSpecificCharacterInString( String message, char character ) {
        int countCharacter = 0;
        for ( int index = 0; index < message.length(); index++ ) {
            if ( message.charAt(index) == character ) countCharacter++;
        }
        return countCharacter;
    }

    public static int countSpecificCharacterInStringUsingArray( String message, char character) {
        int countCharacter = 0;
        for ( char eachCharacter : message.toCharArray() ) {
            if ( eachCharacter == character ) countCharacter++;
        }
        return countCharacter;
    }

}
