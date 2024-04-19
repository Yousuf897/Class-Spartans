package week_3.lab_session;

public class WorkingWithDataTypes {


    /*
    *
    * Q1: Choose the best data type to store a user's middle initial and explain why.
    *
    * Q2: Identify the reference data type from the following: int, double, String, boolean.
    *
    * Q3: What is the default value of a boolean variable in Java and why is this the case?
    *
    * Q4: Determine the output for String str = "Hello World"; System.out.println(str.length());
    *
    * Q5: Demonstrate the correct way to declare and initialize a String using both literal and object notation.
    *
    * */


    public static void main(String[] args) {

        // Q1 Answer:
        // The data type should be char, because when it comes to storing initials, we only pass one character
        // rather than passing multiple characters (Sequence of characters). So the data type should be char.
        char middleNameInitial;


        System.out.println(" * * * * *  * * * * *  * * * * *  * * * * *  * * * * *  ");


        // Q2 Answer:
        // String is the reference data type, because int, double and boolean falls under the category of the
        // primitive data types.



        System.out.println(" * * * * *  * * * * *  * * * * *  * * * * *  * * * * *  ");


        // Q3 Answer:
        // Default value of the boolean data type is false.


        System.out.println(" * * * * *  * * * * *  * * * * *  * * * * *  * * * * *  ");


        // Q4 Answer:
        // 11, because including space there are 11 characters.
        String str = "Hello World";
        System.out.println(str.length());


        System.out.println(" * * * * *  * * * * *  * * * * *  * * * * *  * * * * *  ");


        // Q5 Answer:
        // literal Annotation of String
        String firstName = "";
        String lastName = "Tony";

        // Object Annotation
        String middleName = new String("Alexander");

        System.out.println( middleName );


        System.out.println(" * * * * *  * * * * *  * * * * *  * * * * *  * * * * *  ");


    }

}
