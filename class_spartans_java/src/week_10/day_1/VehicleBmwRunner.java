package week_10.day_1;

public class VehicleBmwRunner {

    public static void main(String[] args) {

        var bmwObj = new BMW();
        bmwObj.printMessage();

        bmwObj.companyName = "BMW";
        bmwObj.trim = "X7";
        bmwObj.maxSpeed = 250;
        System.out.println( bmwObj.companyName );
        System.out.println( bmwObj.trim );
        bmwObj.startEngine();
        bmwObj.stopEngine();

        var toyotaObj = new Toyota();

        toyotaObj.companyName = "Toyota";
        toyotaObj.maxSpeed = 100;
        toyotaObj.numberOfDoors = 4;

        toyotaObj.startEngine();
        toyotaObj.stopEngine();

    }

}
