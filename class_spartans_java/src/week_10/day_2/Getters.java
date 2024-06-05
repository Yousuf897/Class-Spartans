package week_10.day_2.gift_game;

public class Getters {

    public static void main(String[] args) {
       printMessage();
       printFirstName("John");
       printFirstName("Mathias");
       var getterObj = new GettersPractice();
       // Get the value of First Name
        // Get the value of Last Name
        getterObj.setFirstName("Mathias");
        getterObj.setLastName("Alexander");
        System.out.println( getterObj.getFirstName() );
        System.out.println( getterObj.getLastName() );
    }

    // Access Modifier, Return Type, nameOfMethod( Parameters (optional) ) { }
    public static void printMessage() {
        System.out.println("Welcome to TekSchool!");
    }

    public static void printFirstName( String firstName ) {
        System.out.println("First Name: " + firstName);
    }



}
