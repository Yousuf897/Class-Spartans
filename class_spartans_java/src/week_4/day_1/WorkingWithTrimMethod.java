package week_4.day_1;

public class WorkingWithTrimMethod {

    // trim(): Remove the spaces before and after your String.

    public static void main(String[] args) {

        String message = "                Welcome to Java                ";
        System.out.println( message );

        message = message.trim();
        System.out.println( message.trim() );
        System.out.println( message );

        System.out.println( message.replace('t', 'T') );
        System.out.println( message.replace(" Welcome to Java", "     welcome to java    ").trim().toUpperCase() );

        System.out.println( message.replaceAll(" ", "").toUpperCase() );
        //                                          ' '
        String charAtIndexZero = message.charAt(0) + "";
        System.out.println( message.replace(message.charAt(0), 'P') );
        System.out.println( (message.replaceAll(charAtIndexZero, "P")) );
        System.out.println( (message.replaceAll(charAtIndexZero, "P")) );


    }
}
