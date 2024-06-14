package week_11.lab_session.countwords;

import java.util.HashMap;
import java.util.Map;

public class Config {

    // Fields
    private String str;
    private final Map<String, Integer> myMap;

    // Constructor
    public Config( String str ) {
        setStr(str);
        myMap = new HashMap<>();
    }

    // Getters & Setters
    public String getStr() {return str;}
    public Map<String, Integer> getMyMap() {return myMap;}
    public void setStr(String str) {this.str = str;}

    public void countAndPrintWords( String str ) {
        String[] words = str.split(" ");
        int countWelcome = 0;
        int countTo = 0;
        int countTekSchool = 0;
        int countJava = 0;
        int countIs = 0;
        int countFun = 0;
        // Find the count of each word in this string
        // For instance
        // Welcome -> 2
        // to -> 2
        for ( String word : words ) {
            if ( word.equals("Welcome") ) countWelcome++;
            else if ( word.equals("to") ) countTo++;
            else if ( word.equals("TekSchool") ) countTekSchool++;
            else if ( word.equals("Java") ) countJava++;
            else if ( word.equals("is") ) countIs++;
            else if ( word.equals("fun") ) countFun++;
        }

        System.out.println("Welcome -> " + countWelcome);
        System.out.println("to -> " + countTo);
        System.out.println("TekSchool -> " + countTekSchool);
        System.out.println("Java -> " + countJava);
        System.out.println("is -> " + countIs);
        System.out.println("fun -> " + countFun);
    }

    private void addWordsToMap() {
        for ( String word : getStr().split(" ") ) {
            // if the word is present in map, add the word and get the current count and increase by 1
            if ( myMap.containsKey(word) ) {
                myMap.put(word, myMap.get(word) + 1);
            }  else {
                // if the word is not present in map, add the word and give a count of 1
                myMap.put(word, 1);
            }
        }
    }

    public void printWordsInMap() {
        addWordsToMap();
        // System.out.println( getMyMap() );
        for ( Map.Entry<String, Integer> entry : getMyMap().entrySet() ) {
            System.out.println( entry.getKey() + " => " + entry.getValue() );
        }
    }

    // Add words to map in easy way
    private void addWordsToMapSolutionTwo() {
        for ( String word : getStr().split(" ") ) {
            getMyMap().merge( word, 1, Integer::sum );
        }
    }

    public void printWordsInMapSolutionTwo() {
        addWordsToMapSolutionTwo();
        getMyMap().forEach( ( word, count ) -> System.out.println( word + " => " + count ) );
    }

}
