package week_11.day_1.super_keyword;

public class ClassB extends ClassA {

    String firstName;

    public ClassB() {
        super();
        this.firstName = super.firstName;
    }

    // Method to print the value of classB firstName
    public void printClassBFirstName() {
        System.out.println( firstName );
    }

    public void printClassAFirstName() {
        System.out.println( super.firstName );
    }

    // Print Parent FirstName
    public void printFirstName() {
       super.printFirstName();
    }

    public void setFirstName ( String firstName ) {
        this.firstName = firstName;
    }

    // Store the value of firstName from parent class into firstName of classB
    void setValueOfParent() {
        this.firstName = super.firstName;
    }


}
