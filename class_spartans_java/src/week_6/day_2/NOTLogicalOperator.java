package week_6.day_2;

public class NOTLogicalOperator {

        // !

       /* Question 2: Weekend Alarm

        Imagine you have two boolean variables: isWeekend and isHoliday.
        On weekends or holidays, you prefer to sleep in, so you set your alarm to OFF.
        Otherwise, on weekdays that aren't holidays, you set your alarm to ON.
        Set any initial values for isWeekend and isHoliday.
        Determine the state of the alarm based on the values
*/

    public static void main(String[] args) {


        String firstName = "John";
        String lastName = "Doe";

        System.out.println( firstName.equals(lastName) ); // True , false

        // return true if they're not equal
        System.out.println( !(firstName.equals(lastName)) ); // false --> true

        // if true && true || true && false || true && false ?

        /*
        * New Password: ASD
        * Re-enter Password: asd
        * */

        /*
        * if ( newPassword.equals(reEnterPassword) ) {
        *       // Change the user password successfully
        *   } else {
        *       // Password don't match, please re-enter
        *       }
        *
        * */

        /*
        * if ( !(newPassword.equals(reEnterPassword)) )
        *       // Password don't match, please re-enter
        *   } else {
        *       // Change the user password successfully
        *   }
        * */




    }


}
