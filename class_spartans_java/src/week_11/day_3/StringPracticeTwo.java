package week_11.day_3;

public class StringPracticeTwo {

    public static void main(String[] args) {

        // Fields
        String strOne = "Hello"; // --> "Hello" --> String Litteral --> Stored in String pool --> Heap
        System.out.println( strOne.hashCode() ); // 69609650

        String strTwo = "Hello"; // 102
//        String strTwo = "Hello";
        System.out.println( strTwo.hashCode() ); // 69609650
        System.out.println( strOne );

        strOne = "Word";
        System.out.println( strOne.hashCode() );

        System.out.println( strTwo );

        strTwo = "Zia";

        System.out.println(strOne.hashCode() );

        System.out.println( strOne ); // Word

        int number = 10;

        System.out.println( number );



    }

}
