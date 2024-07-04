package week_14.day_3.maps;

import java.util.HashMap;

public class InterviewQuestion {

    public static void main(String[] args) {

        String str = "kljaskjldjalksdlkajskldlkaslkdjlkasjdlkaljksdlkjasljkdljkasdjaklsd";
        String[] names = { "Mathias", "Mathias", "Eric", "Bob", "Tony", "Tony", "Eva" };
        // a => 25
        printCountOfCharacters(str);
        printCountOfNames(names);
    }

    public static void printCountOfCharacters( String str ) {
        HashMap<Character, Integer> mapOfCharacters = new HashMap<>();
        for ( char eachCharacter : str.toCharArray() ) {
            // if the character exist in map, add it to the map and increase the count by 1
            if ( mapOfCharacters.containsKey( eachCharacter ) ) {
                mapOfCharacters.put( eachCharacter, mapOfCharacters.get(eachCharacter) + 1 );
            }  // if the character doesn't exist in map, add it to the map and give it the count of 1
            else {
                mapOfCharacters.put( eachCharacter, 1 );
            }
        }
        mapOfCharacters.forEach( ( character, count ) -> System.out.println( character + " - " + count ) );
    }

    public static void printCountOfNames( String[] str ) {
        HashMap<String, Integer> mapOfCharacters = new HashMap<>();
        for ( String eachName : str) {
            // if the character exist in map, add it to the map and increase the count by 1
            if ( mapOfCharacters.containsKey( eachName ) ) {
                mapOfCharacters.put( eachName, mapOfCharacters.get(eachName) + 1 );
            }  // if the character doesn't exist in map, add it to the map and give it the count of 1
            else {
                mapOfCharacters.put( eachName, 1 );
            }
        }
        mapOfCharacters.forEach( ( name, count ) -> System.out.println( name + " - " + count ) );
    }



}
