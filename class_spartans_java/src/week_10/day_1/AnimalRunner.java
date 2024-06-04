package week_10.day_1;

public class AnimalRunner {

    public static void main(String[] args) {
        // Creating three Animal objects with required values
        Animal animal1 = new Animal("Dog", "Canine", 5, "Bark");
        Animal animal2 = new Animal("Cat", "Feline", 3, "Meow");
        Animal animal3 = new Animal("Lion", "Feline", 8, "Roar");

        // Printing information of each animal
        System.out.println("Information of Animal 1:");
        animal1.printAnimalInformation();
        System.out.println();

        System.out.println("Information of Animal 2:");
        animal2.printAnimalInformation();
        System.out.println();

        System.out.println("Information of Animal 3:");
        animal3.printAnimalInformation();

    }

}
