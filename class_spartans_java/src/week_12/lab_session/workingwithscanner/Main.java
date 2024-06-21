package week_12.lab_session.workingwithscanner;

public class Main {

    public static void main(String[] args) {

        int size = ScannerConfig.getIntInput(FeedBack.ENTER_SIZE);
        String[] usernames = new String[size];

        for ( int index = 0; index < size; index++ ) {
            String username = ScannerConfig.getStringInput(FeedBack.ENTER_USERNAME + " " + ( index + 1 ) );
            // arrayName[index] = "String Value";
            usernames[index] = username;
        }

        displayUsernames(usernames);
    }

    public static void displayUsernames(String[] array) {
        FeedBack.displayMessage(FeedBack.DISPLAY_USERNAME);
        for ( String username : array ) {
            FeedBack.displayMessage(username);
        }
    }

}
