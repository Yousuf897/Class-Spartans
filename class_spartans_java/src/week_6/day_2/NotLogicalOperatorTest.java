package week_6.day_2;

public class NotLogicalOperatorTest {



    public static void main(String[] args) {

        String text = "Apple Watch Series 9 [GPS 41mm] Smartwatch with Starlight Aluminum Case with Starlight Sport Band S/M. Fitness Tracker, ECG Apps, Always-On Retina Display, ";
        String webSiteText = " String text = Apple Watch Series 9 [GPS 41mm] Smartwatch with Starlight Aluminum Case with Starlight Sport Band S/M. Fitness Tracker, ECG Apps, Always-On Retina Display,";

        if ( text.equals(webSiteText) ) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }


        if ( !(text.equals(webSiteText) ) ) {
            System.out.println("They are not equal");
        } else {
            System.out.println("They are equal");
        }
    }

}
