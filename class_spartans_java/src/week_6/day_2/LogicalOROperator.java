package week_6.day_2;

public class LogicalOROperator {

    // AND --> condition && condition --> true && true --> true
    // AND --> condition && condition --> false && true --> false
    // AND --> condition && condition --> true && false --> false
    // AND --> condition && condition --> false && false --> false

    /*  OR (||): At least one condition must be true.
     *   true - true = true
     *   false - true = true
     *   true - false = true
     *   false - false = false
     *
     * */

    /*
     *       true            false       false
     * if ( condition || condition || condition ) {
     *       System.out.println("Yes");
     * } else {
     *  System.out.println("No");
     * }
     *
     *           true        false       true            true
     *                   FALSE       ||          TRUE
     *   if ( condition && condition || condition && condition ) {
     *       System.out.println("Yes");
     *   } else {
     *       System.out.println("No");
     *   }
     *
     *               false     false       true              true         false          false
     *                       true                     &              true          ||  false
     *                                   true                                      ||  false
     *   if (  ( condition & condition || condition ) & ( condition || condition ) ||  condition ) {
     *       System.out.println("Yes");
     *   } else {
     *   System.out.println("No");
     * }
     *
     *
     * */

}
