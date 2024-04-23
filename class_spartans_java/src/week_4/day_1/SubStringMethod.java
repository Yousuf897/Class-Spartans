package week_4.day_1;

public class SubStringMethod {

    // subString(): --> Print pieces of string. You have to pass start Index and end Index.

    public static void main(String[] args) {

        String message = "is simply dummy text of the printing and Eric industry. Lorem Ipsum has been " +
                "the industry's standard dummy";

        String fullName = "Eric Morphy";

        System.out.println( fullName );
        System.out.println( fullName.substring(7) );
        System.out.println( fullName.substring(0,3) ); // endIndex is exclusive. which means
        // if you pass 3, it is going to be 2 since 3 - 1 = 2;
        System.out.println( fullName.substring(0,4) );
        System.out.println( fullName.substring(1, (fullName.length() - 1) + 1 ) );
        System.out.println( fullName.substring(1) );
        System.out.println( fullName.substring(1, 10) );

        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * * " );


        System.out.println( message.substring(10) );
        System.out.println( message.substring(10, message.length() - 4) );
        System.out.println( message.substring(10, message.length() - 5) );

        // Eric Morphy

    }

}
