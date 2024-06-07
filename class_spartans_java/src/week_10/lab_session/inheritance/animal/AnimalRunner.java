package week_10.lab_session.inheritance.animal;

public class AnimalRunner {

    /*
 Question:
Create a superclass Animal with attributes name and age. Define a subclass Dog inheriting from
Animal with an additional attribute breed. Write a Java program to implement this hierarchy
and demonstrate single inheritance by accessing the superclass attributes from the subclass.

Steps:
Define a superclass Animal with attributes name and age.
Define a subclass Dog inheriting from Animal with an additional attribute breed.
Implement a constructor for the superclass Animal that initializes its attributes.
Implement a constructor for the subclass Dog that initializes its attributes and calls the superclass
constructor using the super keyword.
Create an instance of Dog in the main method.
Set values for the attributes of the Dog object.
Access and display the attributes of both the superclass Animal and the subclass Dog using getter methods.
Compile and run the program to verify the output.
 */

    public static void main(String[] args) {

        // Object
        var husky = new Dog("King", 3, "Husky");
        var germanShepherd = new Dog("Lucky", 4, "German Shepherd");

        // Print husky attributes
        husky.printDogInfo();

        // Print German Shepherd Properties
        germanShepherd.printDogInfo();


    }

}
