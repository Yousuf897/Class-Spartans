package week_3.day_1;

public class WorkingWithCharacters {

    public static void main(String[] args) {
        char singleCharacter = 'B';
        String message = "Welcome to TekSchool";

        System.out.println( singleCharacter + message );
        //                      B      +         BBBB == BBBBBBBB
        System.out.println( singleCharacter + 10 );
        //                      B    +      10   = B10

        System.out.println( 'A' + 0 );
        System.out.println( 'a' + 0 );
        System.out.println( '@' + 0 );

        // middle Intital char Yousuf -> Y
        // char, int
        // char Y, Yousuf -> String
    }

}
