package week_11.lab_session.reversestring;

public class Main {

    public static void main(String[] args) {

        String str = "Hello World";

//        var config = new Config(str);
//        config.printReversedVersion();

        System.out.println("Original Value: " + str );
        System.out.println("Reversed Value: " + reverseWordUsingStringBuilder(str) );

    }

    public static String reverseWordUsingStringBuilder( String str ) {
        var result = new StringBuilder();

        for ( String word : str.split(" ") ) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            result.append(reversedWord).append(" ");
        }
        return result.toString();
    }

}
