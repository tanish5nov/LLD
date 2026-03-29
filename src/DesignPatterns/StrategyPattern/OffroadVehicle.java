package DesignPatterns.StrategyPattern;

import DesignPatterns.StrategyPattern.DrivingStrategies.ConcreteStrategies.OffroadDriveStrategy;
import DesignPatterns.StrategyPattern.Vehicles.Vehicle;

public class OffroadVehicle extends Vehicle {
    public OffroadVehicle() {
        super(new OffroadDriveStrategy());
    }
}