package week_6.day_3;

public class NOTLogicalOperatorReview {

    public static void main(String[] args) {

        System.out.println( !(10 < 20) ); // true, false

        System.out.println( true || false );
        System.out.println( true && false );

        System.out.println( true || false && true && true && false && false || true );
        System.out.println( true && false && true && true && false && false && true );

    }

}
