import DesignPatterns.StrategyPattern.OffroadVehicle;
import DesignPatterns.StrategyPattern.Vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new OffroadVehicle();
        vehicle.drive();
        // dummy commit
    }
}