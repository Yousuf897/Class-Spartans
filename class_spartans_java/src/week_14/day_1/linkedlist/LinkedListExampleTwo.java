package week_14.day_1.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExampleTwo {

    public static void main(String[] args) {

        String[] names = { "Mathias", "Tony", "James", "Safiullah", "Erin", "Eric" };
        List<String> listOfNames = new LinkedList<>();

//        for ( int i = 0; i < names.length; i++ ) {
//            listOfNames.add( names[i] );
//        }

        for ( String name : names ) {
            listOfNames.add(name);
        }

        System.out.println( listOfNames );

//        for ( String name : listOfNames  ) {
//            listOfNames.remove( name );
//        }

        System.out.println(listOfNames);


        /*
        listOfNames.clear();

        System.out.println( listOfNames );

         */



    }

}
