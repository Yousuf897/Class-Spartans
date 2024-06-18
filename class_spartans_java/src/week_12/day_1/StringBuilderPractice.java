package week_12.day_1;

public class StringBuilderPractice {

    public static void main(String[] args) {

        // Object of StringBuilder
        var strBuilder = new StringBuilder("Tony"); // We have assigned Tony to StringBuilder
        System.out.println( strBuilder );

        // Concat new value, in StringBuilder and Buffer it's called append();
        strBuilder.append(" Alex ");

        System.out.println( strBuilder );

        // We convert the mutable String to immutable string using toString() and we will have
        // access to all methods of immutable string
        System.out.println( strBuilder.reverse().toString().toUpperCase() );
        System.out.println( strBuilder.toString().toUpperCase() );

    }

}
