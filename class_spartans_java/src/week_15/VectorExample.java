package week_15;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
//        List<String> vectorTwo = new Vector<>();
//        var vectorThree = new Vector<>();

        // add elements to vector
        vector.add(0, "Tony");
        vector.add("Bob");

        vector.addLast("Trevor");

        System.out.println( vector );

        for ( String element : vector ) {
            System.out.println( element );
        }

        // vector.forEach((element) -> System.out.println( element ));

        // How to remove elements
        vector.remove("Trevor");
        System.out.println( vector );

        vector.remove(1);

        System.out.println( vector );

        vector.clear();

        System.out.println( vector );

        System.out.println( vector.isEmpty() );

        System.out.println( vector.size() );



    }

}
