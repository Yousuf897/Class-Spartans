package week_11.day_2;

public class VehicleRunner {

    // Create an object of Electric Car

    public static void main(String[] args) {

        var tesla = new ElectricCar("Tesla", 4, "Black");
        tesla.start();
        tesla.stop();
        tesla.chargeBattery();

        tesla.printElectricCarInfo();

    }

}
