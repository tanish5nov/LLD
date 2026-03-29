package DesignPatterns.StrategyPattern;

import DesignPatterns.StrategyPattern.DrivingStrategies.ConcreteStrategies.SportsDriveStrategy;
import DesignPatterns.StrategyPattern.Vehicles.Vehicle;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}