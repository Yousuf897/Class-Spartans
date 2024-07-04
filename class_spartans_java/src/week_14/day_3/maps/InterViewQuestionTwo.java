package week_14.day_3.maps;

import java.util.HashMap;
import java.util.Map;

public class InterViewQuestionTwo {

    public static void main(String[] args) {
        String str = "kljaskjldjalksdlkajskldlkaslkdjlkasjdlkaljksdlkjasljkdljkasdjaklsd";
        HashMap<Character, Integer> mapOfCharacters = new HashMap<>();
        for ( char character : str.toCharArray() )  mapOfCharacters.merge(character, 1, Integer::sum);
        mapOfCharacters.forEach( (character, count) -> System.out.println( character + " - " + count   ) );

        String[] names = { "Mathias", "Mathias", "Eric", "Bob", "Tony", "Tony", "Eva" };
        HashMap<String, Integer> mapOfNames = new HashMap<>();
                // Mathias - 1

        for ( String name : names ) {
            if ( mapOfNames.containsKey(name) ) {
                mapOfNames.put( name, mapOfNames.get(name) + 1  );
            } else {
                mapOfNames.put(name, 1);
            }
        }

        for ( Map.Entry<String, Integer> entry : mapOfNames.entrySet() ) {
            System.out.println( entry.getKey() + " => " + entry.getValue() );
        }

//       for ( String name : names ) mapOfNames.merge(name, 1, Integer::sum);
//        mapOfNames.forEach( ( name, count ) -> System.out.println( name + " => " + count ) );

    }
}
