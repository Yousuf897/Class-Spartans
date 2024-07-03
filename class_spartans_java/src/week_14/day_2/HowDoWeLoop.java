package week_14.day_2;

import java.util.ArrayList;

public class HowDoWeLoop {

    public static void main(String[] args) {

        // To add 50 elements to my arrayList
        // where every element is Bob

        ArrayList<String> listOfNames = new ArrayList<>();

        for ( int i = 1; i <= 50; i++ ) {
            listOfNames.add("Bob");
        }

        System.out.println( listOfNames );
        int countElement = 0;

//        for ( String element : listOfNames ) {
//            countElement++;
//        }
//
//        System.out.println("Count: " + countElement);

        System.out.println("Count: " + listOfNames.size() );

    }

}
