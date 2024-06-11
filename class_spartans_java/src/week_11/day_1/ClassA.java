package week_11.day_1;

public class ClassA {

    private String firstName;
    private String lastName;

    // Constructor
    public ClassA( String firstName, String lastName ) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    // Getters
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}

    // Setters
    private void setFirstName(String firstName) {this.firstName = firstName;}
    private void setLastName(String lastName) {this.lastName = lastName;}
}

class Practice {
    public static void main(String[] args) {

        var classA = new ClassA("John", "Doe");
        System.out.println( classA.getFirstName() );
        System.out.println( classA.getLastName() );

    }
}
