package week_3.day_1;

public class ReferenceDataType {

    public static void main(String[] args) {

        int number = 10;
        double doubleNumber = 0.0;
        String firstName = "John";
        String lastName = "John";
        String middleName = "Alexander";
        String message = "John"; // 101
        message = "TekSchool";

        System.out.println( firstName.hashCode() );
        System.out.println( lastName.hashCode() );
        System.out.println( message.hashCode() );

   /*   2314539
        2314539
        2314539
        1372335118
        */

    }

}
