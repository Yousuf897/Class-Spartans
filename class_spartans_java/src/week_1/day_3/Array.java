package week_1.day_3;

public class Array {

    public static void main(String[] args) {
        String firstName = "John";
        String[] listOfFirstName = {"John", "Eric", "Erin", "Spartans"};
        //                            0       1        2        3

        System.out.println( firstName );
        System.out.println( listOfFirstName[1] );
        System.out.println( listOfFirstName[3] );

        for (int index = 0; index < listOfFirstName.length; index++) {
            System.out.println( listOfFirstName[index] );
        }
    }

}
