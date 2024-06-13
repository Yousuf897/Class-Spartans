package week_11.day_3;

public class StringPractice {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello"); // garbage collections

/*        System.out.println( str1.hashCode() );
        System.out.println( str2.hashCode() );
        System.out.println( str3.hashCode() );*/
        System.out.println( str2 == str3 ); // false
        System.out.println( str2.equals(str3)  ); // true
        System.out.println( 10 == 10 ); // true
        System.out.println( 11 == 10 ); // false

        /*
        *
        * 69609650
            69609650
        * */

    }

}
