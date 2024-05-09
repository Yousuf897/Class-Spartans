package week_6.day_3;

public class XORActivity {

    public static void main(String[] args) {

        System.out.println( 55 > 45  ^ 10 < 20  );
        System.out.println( 55 > 45  ^ 10 < 20 ^ true  );
        System.out.println( 55 > 45  ^ 10 < 20 ^ false  );
        System.out.println( 55 > 45  ^ 10 < 20 ^ false || true );
        System.out.println( !( 55 > 45  ^ 10 < 20 ^ false || true && false && true && true && true ) );

        String message = "WelcomeToTEKschool123#*(!123";

        System.out.println( message );
        System.out.println( message.replaceAll("[^a-z]", "") );
        System.out.println( message.replaceAll("[^A-Z]", "") );
        System.out.println( message.replaceAll("[A-Z]", "") );
        System.out.println( message.replaceAll("[^1-3]", "") );
        System.out.println( message.replaceAll("[0-9]", "") );

        System.out.println( 55 > 45 ^ 10 < 20 ); // XOR --> false
        System.out.println( 55 > 45 || 10 < 20 );  // OR --> true

        // someone@jh.com
        // someonejh.com
        // someonejh.commmmmmmmm
        // s.commmmmmmmm



    }

}


