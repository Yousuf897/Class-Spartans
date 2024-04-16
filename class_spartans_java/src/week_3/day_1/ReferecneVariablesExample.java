package week_3.day_1;

public class ReferecneVariablesExample {

    public static void main(String[] args) {

        // 2612646 --> Tony
        // 3565958 --> tony
        // 2168487 --> Eric
        // 696546630 --> Alexander

        String firstName = "Tony";
        System.out.println( firstName.hashCode() );

        System.out.println(" * * * * *  * * * * *  * * * * *  * * * * * ");

        String lastName = "Tony";
        System.out.println( lastName.hashCode() );

        System.out.println(" * * * * *  * * * * *  * * * * *  * * * * * ");

        firstName = "Eric";
        System.out.println( firstName.hashCode() );

        System.out.println(" * * * * *  * * * * *  * * * * *  * * * * * ");

        lastName = "Alexander";
        System.out.println( lastName.hashCode() );


        System.out.println(" * * * * *  * * * * *  * * * * *  * * * * * ");

        String middleName = "Tony";
        System.out.println( middleName.hashCode() );


        System.out.println(" * * * * *  * * * * *  * * * * *  * * * * * ");

        String message = "tony";
        System.out.println( message.hashCode() );


        System.out.println( lastName );

        int number = 10;
       // System.out.println( number.hashCode() );


    }

}
