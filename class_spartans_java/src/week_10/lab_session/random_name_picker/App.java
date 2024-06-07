package week_10.lab_session.random_name_picker;

public class App {
    // Design an Application which is going to accept an array
    // of type String, and it will return random names whenever
    // a specific method is being called.
    // Not acceptable if you have more than 3 lines in main method!

    public static void main(String[] args) {

        String[] names = {"John", "Tony", "David", "Eve", "Mathias"};
        var selector = new RandomNameSelector(names);
        System.out.println( selector.getRandomName() );

    }
}
