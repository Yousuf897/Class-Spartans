package week_10.day_2.gift_game;

public class Student {

    // Variables
    private String name;
    private String gift;

    // Constructor
    public Student(String name) {
        setName(name);
    }

    // Getters
    public String getName() {return name;}
    public String getGift() {return gift;}

    // Setters
    public void setGift(String gift) {this.gift = gift;}
    public void setName( String name ) {this.name = name;}

}
