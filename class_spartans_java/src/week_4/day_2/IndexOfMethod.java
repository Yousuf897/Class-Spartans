package week_4.day_2;

public class IndexOfMethod {

    public static void main(String[] args) {

        String message = "Welcome to TekSchool Spartans Students Java is easy!";

        // charAt()
        System.out.println( message.charAt(0) ); // W
        System.out.println( message.charAt(4) ); // O


        // indexOf
        System.out.println( message.indexOf('o') ); // 4
        System.out.println( message.indexOf('!') ); // 20
        System.out.println( message.indexOf("Welcome")); // 0
        System.out.println( message.indexOf("Student")); // 30


//        (message.indexOf("Student")).length() - 1;


    }

}
