package week_10.lab_session.inheritance.animal;

public class Animal {

    // Variables
    private String name;
    private int age;

    // Constructors
    public Animal( String name, int age ) {
        setName(name);
        setAge(age);
    }

    // Getters
    public String getName() {return name;}
    public int getAge() {return age;}

    // Setters
    private void setName(String name) {this.name = name;}
    private void setAge(int age) {this.age = age;}
}
