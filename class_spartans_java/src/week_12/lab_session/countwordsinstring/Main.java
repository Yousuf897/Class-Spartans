package week_12.lab_session.countwordsinstring;

public class Main {

    // Create a method to search for a specific word in a string
    // method should expect a string and a word to look for
    // and return the count of the word

    public static void main(String[] args) {
        String message = "Hello World World World World";
        printMessage(message, "Java");
    }

    private static int countNumberOfWords( String message, String wordToSearch ) {
        int countWord = 0;
        for ( String word : message.split(" ") ) {
            if ( word.equals(wordToSearch) ) {
                countWord++;
            }
        }
        return countWord;
    }

    public static void printMessage( String message, String wordToSearch ) {
        if ( countNumberOfWords(message, wordToSearch ) == 0 ) {
            System.out.println("Found nothing!");
        } else {
            System.out.println("We have found: " + countNumberOfWords(message, wordToSearch));
        }
    }


}


