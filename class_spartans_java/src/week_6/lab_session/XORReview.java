package week_6.lab_session;

public class XORReview {

    public static void main(String[] args) {

        System.out.println( true && true );
        System.out.println( true && false );

        // OR Logical Operator
        System.out.println( true || true );
        System.out.println( true || false );

        // XOR Logical Operator
        System.out.println( true ^ true ); // false
        System.out.println( true ^ false ); // true


        // NOT Logical Operator
        System.out.println( !(true ^ true) ); // true
        System.out.println( !(true ^ false) ); // false

//        !(equals())

        System.out.println( !(10 == 10) ); // true
        System.out.println( 10 != 10 ); // false
        System.out.println( 10 != 5 ); // true



    }

}
