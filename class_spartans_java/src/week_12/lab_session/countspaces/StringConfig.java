package week_12.lab_session.countspaces;

public class StringConfig {

    // Design the StringConfig class to count the empty spaces in a String
    // Create a method to print the count of empty spaces
    // For instance:
    // There are X number of empty spaces available in the following String "STRING"

    // Fields
    private String string;
    private int numberEmptySpaces;

    // Constructor
    public StringConfig( String string ) {
        setString(string);
        setNumberEmptySpaces(0);
        countEmptySpaces();
    }

    // Getters
    private String getString() {return string;}
    private int getNumberEmptySpaces() { return numberEmptySpaces; }

    // Setters
    private void setString(String string) {this.string = string;}
    private void setNumberEmptySpaces(int numberEmptySpaces) {this.numberEmptySpaces = numberEmptySpaces;}

    // Method to count the empty spaces in a String
    private void countEmptySpaces() {
        for (int index = 0; index < getString().length(); index++) {
            if (getString().charAt(index) == ' ') {
                setNumberEmptySpaces(getNumberEmptySpaces()+1);
                // numberEmptySpaces++;
            }
        }
    }

    // Method to print the result
    public void print() {
        if ( getNumberEmptySpaces() == 0 ) {
            System.out.println("There is no empty" +
                " space available in the following String " + getString());
        } else if ( getNumberEmptySpaces() == 1  ) {
            System.out.println("There is only " + getNumberEmptySpaces() +
                    " space available in the following String " + getString());
        }
        else {
            System.out.println("There are " + getNumberEmptySpaces() +
                    " number of empty spaces available in the following String " + getString());
        }
    }
}
