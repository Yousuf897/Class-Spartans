package week_11.lab_session.countcharacters;

public class Config {

    // Fields
    private String str;
    private int countUpperCase;

    // Constructor
    public Config(String str) {
        setStr(str);
    }

    // Getters & Setters
    private String getStr() {
        return str;
    }

    private void setStr(String str) {
        this.str = str;
    }

    private int getCountUpperCase() {
        return this.countUpperCase;
    }

    private void setCountUpperCase(int countUpperCase) {
        this.countUpperCase = countUpperCase;
    }

    // Method to return the count of uppercase characters
    private int getCountOfUpperCaseCharacters() {
        return getStr().replaceAll("[^A-Z]", "").length();
    }

    // Method to count the uppercase characters using for loop
    private int getCountOfUpperCaseCharactersUsingForLoop() {
        for (char character : getStr().toCharArray()) {
            if (Character.isUpperCase(character)) countUpperCase++;
        }
        return countUpperCase;
    }

    private long getCountOfUpperCaseCharactersUsingInputSteam() {
        return getStr().chars()
                .filter(Character::isUpperCase)
                .count();
    }

    // Method to print the count of uppercase characters
    public void printUpperCaseCharacters() {
        System.out.println("There are " + getCountOfUpperCaseCharacters() +
                " uppercase characters in " + getStr());
    }

    public void printUpperCaseCharactersUsingForLoop() {
        System.out.println("There are " + getCountOfUpperCaseCharactersUsingForLoop() +
                " uppercase characters in " + getStr());
    }

    public void printUpperCaseCharactersUsingInputStream() {
        System.out.println("There are " + getCountOfUpperCaseCharactersUsingInputSteam() +
                " uppercase characters in " + getStr());
    }

    public void printUpperCaseCharactersSolutionTwo() {
        System.out.println(getStr().replaceAll("[^A-Z]", ""));
    }

    public void printUpperCaseCharactersUsingForLoopSolutionTwo() {
        for (char character : getStr().toCharArray()) {
            if (Character.isUpperCase(character)) System.out.print(character + " ");
        }
    }

    public void printUpperCaseCharactersUsingInputStreamSolutionTwo() {
        getStr().chars()
                .filter(Character::isUpperCase)
                .peek(character -> System.out.print((char) character + " "))
                .count();
    }

    // * * * * * * * * * * Numbers (Digits) * * * * * * * * * *
    // Method to print digits
    public void printDigitsOutOfAString() {
        System.out.println(getStr().replaceAll("[^0-9]", ""));
    }

    public void printDigitsUsingInputStream() {
        getStr().chars()
                .filter(Character::isDigit)
                .peek( number -> System.out.println( (int) number +  " " ) );
    }

    public void printDigitsUsingForLoop() {
        for (char character : getStr().toCharArray()) {
            if (Character.isDigit(character)) System.out.print( character +  " " );
        }
    }

}