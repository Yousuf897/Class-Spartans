package week_6.day_3;

public class XORLogicalOperator {

    /*  XOR ( ^ ): Exactly one of condition must be true not both!
     *   true - true    = false
     *   false - true   = true
     *   true - false   = true
     *   false - false  = false
     *
     */


    /*
     *       true            false       false
     *                true       ^   false
     *                      TRUE
     * if ( condition || condition ^ condition ) {
     *       System.out.println("Yes");
     * } else {
     *  System.out.println("No");
     * }
     *
     *           true        false       true            true
     *                  true        ||          false
     *                              TRUE
     *   if ( condition ^ condition || condition ^ condition ) {
     *       System.out.println("Yes");
     *   } else {
     *       System.out.println("No");
     *   }
     *
     *               false     false       true              true         false          false
     *                          true                  ^         true               ||  false
     *                              false                 ||                       false
     *                                          FALSE
     *   if (  ( condition & condition || condition ) ^ ( condition || condition ) ||  condition ) {
     *       System.out.println("Yes");
     *   } else {
     *   System.out.println("No");
     * }
     *
     *
     * */

}
