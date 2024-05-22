package week_8.day_2;

public class StringActivityOne {

    // String message = "Welcome to TekSchool";

    public static void main(String[] args) {

        // 3 Words
        String message = "Welcome to TekSchool";
/*        String message = "Welcome,to,TekSchool";
        String message = "Welcome + to + TekSchool";*/

        String[] listOfWords = message.split(" ");
  /*      String[] listOfWords = message.split(" +");
        String[] listOfWords = message.split(" +");*/

        for ( String value : listOfWords ) {
            System.out.println( value );
        }



    }

}
