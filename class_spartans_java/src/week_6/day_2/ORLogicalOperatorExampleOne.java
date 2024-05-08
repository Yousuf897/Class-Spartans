package week_6.day_2;

public class ORLogicalOperatorExampleOne {

    /*
    *
    * if ( true && true || false && true && true && false ) {
    *   System.out.println("A");
    * } else {
    *   System.out.println("B");
    * }
    *
    * */

    public static void main(String[] args) {

          if ( true && true || false && true && true && false ) {
            System.out.println("A");
          } else {
            System.out.println("B");
          }

    }

}
