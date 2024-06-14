package week_11.lab_session.reversestring;

public class Config {

    // Fields
    private String str;
    private String reversedVersion;
    private String[] words;

    // Constructor
    public Config( String str ) {
        setStr(str);
        setReversedVersion("");
        words = getStr().split(" ");
    }

    // Getters
    private String getStr() {return str;}
    private String getReversedVersion() {return reversedVersion;}
    private String[] getWords() {return words;}

    // Setters
    private void setStr(String str) {this.str = str;}
    private void setReversedVersion(String reversedVersion) {this.reversedVersion = reversedVersion;}
    private void setWords(String[] words) {this.words = words;}

    // Methods
    private String reverseWord() {
        for ( String word : getWords() ) {
            for ( int index = word.length() - 1; index >= 0; index-- ) {
                // Store each character of word to reversedVersion string
                reversedVersion += word.charAt( index );
                // reversedVersion = reversedVersion + word.charAt( index );
            }
            reversedVersion += " ";
            // reversedVersion = reversedVersion + " ";
        }
        return reversedVersion;
    }

    //

    // public Methods
    public void printReversedVersion() {
        System.out.println("original String: " + getStr());
        System.out.println( "Reversed Version is: " + reverseWord() );
    }

}
