package DesignPatterns.StrategyPattern.DrivingStrategies.ConcreteStrategies;

import DesignPatterns.StrategyPattern.DrivingStrategies.DriveStrategy;

public class OffroadDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Vroom Vroom.. Driving Offroad");
    }
}