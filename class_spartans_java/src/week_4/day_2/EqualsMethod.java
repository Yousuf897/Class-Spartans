package week_4.day_2;

public class EqualsMethod {

    public static void main(String[] args) {

        String firstName = "Tony"; // 102
        String lastName = "Tony"; // 102

        System.out.println( firstName == lastName ); // true

        String firstNameTwo = new String("John");
        String lastNameTwo = new String("John");

        System.out.println( firstNameTwo == lastNameTwo );
        System.out.println( firstNameTwo.equals(lastNameTwo) );


    }
}
