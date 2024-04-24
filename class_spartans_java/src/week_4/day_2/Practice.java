package week_4.day_2;

public class Practice {

    public static void main(String[] args) {

        String firstName = "Tony"; // 102
        String lastName = "Tony"; // 102

        System.out.println( firstName == lastName ); // true

        String firstNameTwo = new String("John");
        String lastNameTwo = new String("John");

        System.out.println( firstNameTwo == lastNameTwo );


        System.out.println( firstName.hashCode() ); // 2612646
        System.out.println( lastName.hashCode() ); //  2612646

       // 2612646 ==   2612646 --> True


        System.out.println( firstNameTwo.hashCode() ); // 2314539
        System.out.println( lastNameTwo.hashCode() ); // 2314539

       //  2314539 ==  2314539


    }

}
