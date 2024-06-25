package week_13.day_1;

public class Honda extends Vehicle{

    public Honda(String model, int maxSpeed ) {
        super(model, maxSpeed);
    }

    @Override
    public void printMaxSpeed() {
        System.out.println("Honda "+ model + " max speed: " + maxSpeed);
    }

}
