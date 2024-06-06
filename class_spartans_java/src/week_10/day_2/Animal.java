package week_10.day_2;

public class Animal {

    // Create some properties of animal.
    // Create getters and setters for properties.
    // Create another class called Animal Runner.
    // Call the set methods to set values of current properties.
    // call the get methods to get the values of current properties.
    private String name;
    private String color;
    private int weight;

    // Constructor
    // Method --> Access Modifier NameOfClass( optional ) {}
    public Animal( String name, String color, int weight ) {
        setName(name);
        setColor(color);
        setWeight(weight);
    }

    // Getters
    private String getName() {return name;}
    private String getColor() {return color;}
    private int getWeight() {return weight;}

    // Setter
    private void setName(String name) {this.name = name;}
    private void setColor(String color) {this.color = color;}
    private void setWeight(int weight) {this.weight = weight;}

    // Public method to print Animal Info
    public void printAnimalInfo() {
        System.out.println(" * * * * * + " + getName() + " Information * * * * * ");
        System.out.println("Animal Name: " + getName());
        System.out.println("Animal Color: " + getColor());
        System.out.println("Animal Weight: " + getWeight());
    }
}
