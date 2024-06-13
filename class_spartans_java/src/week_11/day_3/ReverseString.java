package week_11.day_3;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Hello World";
        printReverseString( str );

        System.out.println("Reversed Version: " + reverseString(str));

    }

    public static void printReverseString( String str ) {
        String reverseVersion = "";
        for ( int index = str.length() - 1; index >= 0; index-- ) {
            reverseVersion += str.charAt( index );
//            reverseVersion = str + str.charAt(index);
        }
        System.out.println(" Reversed Version of " + str + " is = " + reverseVersion );
    }

    public static String reverseString( String str ) {
        var stringbBuilder = new StringBuilder(str);
        return stringbBuilder.reverse().toString();
    }

}
