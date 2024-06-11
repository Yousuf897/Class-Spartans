package week_11.day_1;

public class Animal {
    
    // Add some properties for animals make them private too
    // Add some methods for animals make them public too and the constructor

    private String name;
    private String species;
    private int age;

    // Constructor
    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }


    // Method to print Animal Info
    public void printAnimalInfo() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age);
    }


}
