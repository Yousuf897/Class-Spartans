package week_13.lab_session.abstraction;

public class Constructor {
    // Numbers --> 0
    // String --> null
    // boolean false
    String firstName;
    String lastName;

    public Constructor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void printInfo() {
        System.out.println(firstName);
        System.out.println(lastName);
    }
}

class Test {
    public static void main(String[] args) {

        var constructorObj = new Constructor("Tony", "Alexander");
        var constructorObjTwo = new Constructor("Erin", "Morphy");

        constructorObj.printInfo();
        constructorObjTwo.printInfo();
    }
}