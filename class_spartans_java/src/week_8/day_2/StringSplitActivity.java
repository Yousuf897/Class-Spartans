package week_8.day_2;

public class StringSplitActivity {

    public static void main(String[] args) {

        String[] messages = {"Welcome to TekSchool", "Java is easy"};
        int countWords = 0;

        // Return the number of words from messages the second value!
        // We have found 3 words out of second value of messages array!

        System.out.println(messages[1]);
        String[] listOfWords = messages[1].split(" ");

        for ( String eachValue : listOfWords ) {
            System.out.println( eachValue );
            countWords++;
        }

        System.out.println("We have found " + countWords + " words out of second value of messages array!");

    }

}
