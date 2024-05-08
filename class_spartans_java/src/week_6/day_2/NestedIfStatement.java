package week_6.day_2;

public class NestedIfStatement {

    public static void main(String[] args) {

        boolean isRaining = false;
        boolean isWeatherCold = true;

        if ( isRaining ) {
            System.out.println("Yes, it's raining");
            if ( isWeatherCold ) {
                System.out.println("Wear a jacket and take umbreall!");
            } else {
                System.out.println("T-Shirt will do, but remember to take umbrella!");
            }
        } else {
            System.out.println("Man!, outside is not raining!");
        }

    }

}
