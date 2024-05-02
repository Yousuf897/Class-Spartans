package week_5.day_3;

public class SwitchStatement {

    public static void main(String[] args) {

        /*
        * 1 --> Saturday
        * 2 --_ Sunday
        * 3 --> Monday
         * 4 --_ Tuesday
         * 5 --> Wednesday
         * 6 --_ Thursday
         * 7 --> Friday
        * */

        int value = 1;

        if ( value == 1 )
            System.out.println("Saturday");
         else if ( value == 2 ) {
            System.out.println( "Sunday" );
        } else if ( value == 3 ) {
            System.out.println( "Monday" );
        } else if ( value == 4 ) {
            System.out.println( "Tuesday" );
        } else if ( value == 5 ) {
            System.out.println( "Wednesday" );
        } else if ( value == 6 ) {
            System.out.println( "Thursday" );
        } else if ( value == 7 ) {
            System.out.println( "Friday" );
        } else {
            System.out.println("Invalid input");
        }


        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  * * * * * " );

        switch ( value ) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println( "Sunday" );
                break;
            case 3:
                System.out.println( "Monday" );
                break;
            case 4:
                System.out.println( "Tuesday" );
                break;
            case 5:
                System.out.println( "Wednesday" );
                break;
            case 6:
                System.out.println( "Thursday" );
                break;
            case 7:
                System.out.println( "Friday" );
                break;
            default:
                System.out.println("Invalid value!");


        }

    }

}
