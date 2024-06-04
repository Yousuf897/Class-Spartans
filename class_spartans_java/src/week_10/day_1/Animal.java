package week_10.day_1;

public class Animal {
    // Properties of the Animal
    private String name;
    private String species;
    private int age;
    private String sound;

    // AAA methodology: Accessors (Getters)

    /**
     * Gets the name of the animal.
     * @return The name of the animal.
     */
    private String getName() {
        return this.name;
    }

    /**
     * Gets the species of the animal.
     * @return The species of the animal.
     */
    private String getSpecies() {
        return this.species;
    }

    /**
     * Gets the age of the animal.
     * @return The age of the animal.
     */
    private int getAge() {
        return this.age;
    }

    /**
     * Gets the sound of the animal.
     * @return The sound of the animal.
     */
    private String getSound() {
        return this.sound;
    }

    // Constructors

    /**
     * Parametrized constructor to initialize the properties of the animal.
     * @param name The name of the animal.
     * @param species The species of the animal.
     * @param age The age of the animal.
     * @param sound The sound produced by the animal.
     */
    public Animal(String name, String species, int age, String sound) {
        setName(name);
        setSpecies(species);
        setAge(age);
        setSound(sound);
    }

    // Methods

    /**
     * Sets the name of the animal.
     * @param name The name of the animal.
     */
    private void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the species of the animal.
     * @param species The species of the animal.
     */
    private void setSpecies(String species) {
        this.species = species;
    }

    /**
     * Sets the age of the animal.
     * @param age The age of the animal.
     */
    private void setAge(int age) {
        this.age = age;
    }

    /**
     * Sets the sound produced by the animal.
     * @param sound The sound produced by the animal.
     */
    private void setSound(String sound) {
        this.sound = sound;
    }

    /**
     * Prints the information of the animal.
     */
    public void printAnimalInformation() {
        System.out.println("Name: " + getName());
        System.out.println("Species: " + getSpecies());
        System.out.println("Age: " + getAge());
        System.out.println("Sound: " + getSound());
    }
}

