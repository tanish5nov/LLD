package DesignPatterns.StrategyPattern.Vehicles;

import DesignPatterns.StrategyPattern.DrivingStrategies.DriveStrategy;

public abstract class Vehicle {
    private DriveStrategy driveStrategy;
    private Vehicle() {}
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        this.driveStrategy.drive();
    }
}