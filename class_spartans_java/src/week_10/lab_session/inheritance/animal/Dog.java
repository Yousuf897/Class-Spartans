package week_10.lab_session.inheritance.animal;

public class Dog extends Animal {

    // Variables
    private String breed;

    // Constructor
    public Dog( String name, int age, String breed ) {
        super( name, age );
        setBreed(breed);
    }

    // Getters
    public String getBreed() {return breed;}

    // Setters
    private void setBreed(String breed) {this.breed = breed;}

    // Public Method
    public void printDogInfo() {
        System.out.println("Dog Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Breed: " + getBreed());
    }


}
