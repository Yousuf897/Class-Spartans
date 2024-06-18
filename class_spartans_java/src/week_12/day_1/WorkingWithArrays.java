package week_12.day_1;

import java.util.Arrays;

public class WorkingWithArrays {

    public static void main(String[] args) {

        String[] names = {"Trevor", "Tony", "Eric", "James"};
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for ( String name : names ) System.out.println( name + " " );

        System.out.println( names.toString() ); // [Ljava.lang.String;@3feba861
        System.out.println(Arrays.stream(names).toString()); // java.util.stream.ReferencePipeline$Head@5b480cf9
        Arrays.stream(names).toString();
        System.out.println(Arrays.toString(names));

       //  String value = 10 + ""; // --> Converted the int to String
        //  String valueTwo false + "";

        // Print numbers
        System.out.println( Arrays.toString(numbers) );

    }

}
