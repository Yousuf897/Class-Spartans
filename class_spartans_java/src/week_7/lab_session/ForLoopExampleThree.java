package week_7.lab_session;

public class ForLoopExampleThree {

    /*
    * Given Array of String[] studentNames = {
                "mathias", "mahdi", "farhad", "Heala", "saqib",
                "wahidullah", "saliman", "mehwand", "abdul samad",
                "fazil omer", "rostam", "amena", "mansoor", "mostepha",
                "crystal", "darya", "hamed", "khatira", "hasibullah",
                "wasim", "safiullah", "maryam", "maya", "zubaida", "mansoor"
        };
    * */

    /*
    * Write a java program that if we ask for X value it should display the number of records
    * in that array
    * String name = "mathias";
    * Expected output: 1
    * */

    public static void main(String[] args) {

        int countDuplicate = 0; // To keep track of the records
        String nameToSearch = "elena"; // This is the value in which we are trying to search
        String[] studentNames = {
                "mathias", "mahdi", "farhad", "Heala", "saqib",
                "wahidullah", "wahidullah", "elena", "saliman", "mehwand", "abdul samad",
                "fazil omer", "rostam", "amena", "mansoor", "mostepha",
                "crystal", "darya", "hamed", "khatira", "hasibullah",
                "wasim", "safiullah", "maryam", "maya", "zubaida", "mansoor", "elena"
        };

        // Loop through the elements of the array
        for ( int index = 0; index < studentNames.length; index++ ) {
            if ( studentNames[index].equals(nameToSearch) ) countDuplicate++;
        }

        System.out.println("We have found " + countDuplicate + " records for " + nameToSearch);


        // Solution using Enhanced for loop
        for ( String name : studentNames ) {
            if ( name.equals(nameToSearch) ) countDuplicate++;
        }

        System.out.println("We have found " + countDuplicate + " records for " + nameToSearch);

    }

}
