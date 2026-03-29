package DesignPatterns.StrategyPattern;

import DesignPatterns.StrategyPattern.DrivingStrategies.ConcreteStrategies.NormalDriveStrategy;
import DesignPatterns.StrategyPattern.Vehicles.Vehicle;

public class NormalVehicle extends Vehicle {
    public NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}