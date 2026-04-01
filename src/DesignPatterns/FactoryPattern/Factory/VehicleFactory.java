package DesignPatterns.FactoryPattern.Factory;

import DesignPatterns.FactoryPattern.Vehicle.Bike;
import DesignPatterns.FactoryPattern.Vehicle.Car;
import DesignPatterns.FactoryPattern.Vehicle.VehicleProduct;

public class VehicleFactory {
    public static VehicleProduct createVehicle(String type) {
        return switch (type.toLowerCase()) {
            case "car" -> new Car();
            case "bike" -> new Bike();
            default -> throw new IllegalArgumentException("This Type of Vehicle is not Manufactured by us!");
        };
    }
}