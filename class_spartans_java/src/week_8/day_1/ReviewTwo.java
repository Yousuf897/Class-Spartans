package week_8.day_1;

public class ReviewTwo {

    public static void main(String[] args) {

        String[] studentNames = {"Bob", "Tony", "Eric", "Erin"};
        boolean[] listOfConditions = { true, false, false, true };

        // Print the values of studentNames
        for ( String stdName : studentNames ) {
            System.out.print( stdName + " " );
        }

        System.out.println();
        System.out.println(" * * * * *  * * * * * * * * * *");

        // Print the elements using for loop
        for ( int index = 0; index < studentNames.length; index++ ) {
            System.out.print( studentNames[index] + " ");
        }

        System.out.println();
        System.out.println(" * * * * *  * * * * * * * * * *");

        // print elements of boolean array
        for ( boolean eachValue : listOfConditions ) {
            System.out.print( eachValue + " " );
        }

    }

}
