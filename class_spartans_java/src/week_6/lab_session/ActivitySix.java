package week_6.lab_session;

public class ActivitySix {

    /*
    Question: Apple Comparison
    You have two apples with weights: double apple1Weight = 150.0; and double apple2Weight = 155.5;.
    Compare the weights of the two apples.

    Determine:

    If the weights are the same.
    If the weights are different.
    Print out the results of your comparisons.
*/

    public static void main(String[] args) {

        double apple1Weight = 155.5;
        double apple2Weight = 155.5;
        boolean isEqual;

         if ( apple1Weight == apple2Weight ) System.out.println("The weight of apple one and apple two are the same!");
         else System.out.println("The weight of apple one and apple two are not the same!");


         // determine the weight of the apples using ternary operator
        isEqual = ( apple1Weight == apple2Weight ) ? true : false;

        if ( isEqual ) System.out.println("The weight of apple one and apple two are the same!");
        else System.out.println("The weight of apple one and apple two are not the same!");

        // Using one output

        System.out.println( ( apple1Weight == apple2Weight ) ? "Yes, the weight are equal" : "No, the weight are not equal" );


    }


}
