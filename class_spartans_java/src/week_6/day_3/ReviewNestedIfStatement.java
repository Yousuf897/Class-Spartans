package week_6.day_3;

public class ReviewNestedIfStatement {

    public static void main(String[] args) {

        if ( true && true ) { // true
            System.out.println("A"); // A
            if ( false || true ) {
                System.out.println("B"); // B
            } else if ( 10 < 0 ) {
                System.out.println("C");
            } else {
                System.out.println("H");
            }
        }  else {
            System.out.println("Spartans");
        }

    }

}
