package week_10.day_2;

public class AnimalRunner {
    public static void main(String[] args) {
        // Objects
        var goatObj = new Animal("Goat", "Black", 195);
        var huskyObj = new Animal("Husky", "White", 225);

        // Get the values and print them into console
        goatObj.printAnimalInfo();
        huskyObj.printAnimalInfo();
    }
}
