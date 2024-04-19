package week_3.lab_session;

public class MainMethodSignatures {


//    public static void main(String[] args) {
//
//    }

//    public static void main(String args[]) {
//        System.out.println("Hello World");
//    }

    public static void main(String[] args) {
       boolean check = true;
       String message = "Access is " + check;
        System.out.println(message);
        System.out.println("Access is " + check == "Access is true");
        System.out.println(message.equals("Access is true"));
        System.out.println("Access is true".equals("Access is true"));
        System.out.println( 10 == 10 );
        System.out.println( 10 == 100 );
    }


//    public static void main(String... args) {
//        System.out.println("Hello World");
//    }

}
