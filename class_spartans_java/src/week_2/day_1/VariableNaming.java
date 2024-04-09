package week_2.day_1;

public class VariableNaming {

    /*

    You have to give each variable a name so you can use it later in your program.

    There are rules and best practices for naming:

    1. Variable names should be descriptive (e.g., userName, totalAmount).
    2. They cannot start with numbers or special characters except for underscores or dollar signs.
    3. Java is case-sensitive, so age and Age would be different variables.

    */

    public static void main(String[] args) {
        String firstName = "John";
        int numberOne = 10;
        int numberTwo = 20;
        int resultOfTwoNumbers = numberOne + numberTwo;


        System.out.println("Email or mobile phone number");

        // They cannot start with numbers
//        String 1firstName = 20;
//        int 1number = 30;
//        double 10floatNumber = 10.6;


        // They cannot start with special characters except for underscores or dollar signs.
        String _lastName = "Tony";
        String $middle_Name = "Hall";
//        String %universityName = "Hall";
//        String @universityName = "Hall";
//        String !universityName = "Hall";
//        String ?universityName = "Hall";


        int numberThree = 3;
        int NumberThree = 4;

//        int numberThree = 3;
//        int numberThree = 4;


        System.out.println( numberThree ); // 3
        System.out.println( NumberThree ); // 4



        String result = "100%";

        System.out.println(  result + "200%");
        int number = 100;

        System.out.println( number + 200 + "%" );
        System.out.println( number + "%" + 200 );

    }


}
