package week_10.day_2;

public class GettersPractice {

    private String firstName;
    private String lastName;

    public void printInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }

    // Create a method to give us the values of private variables
    // Getters --> Methods
    // Access Modifier, Return Type, nameOfMethod( Parameters (optional) ) { }
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}

    // Access Modifier, Return Type, nameOfMethod( Parameters (optional) ) { }
    public void setFirstName( String firsName ) {this.firstName = firsName;}
    public void setLastName( String lastName ) {this.lastName = lastName;}

}
