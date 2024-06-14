package week_11.lab_session.countwords;

public class Main {

    public static void main(String[] args) {

        String str = "Java is very hard and it's getting interesting";

        var config = new Config(str);

       //  config.countAndPrintWords(str);

        // config.printWordsInMap();

        config.printWordsInMapSolutionTwo();
    }



}
