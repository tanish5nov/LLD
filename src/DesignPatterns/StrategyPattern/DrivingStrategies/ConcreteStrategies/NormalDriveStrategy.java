package DesignPatterns.StrategyPattern.DrivingStrategies.ConcreteStrategies;

import DesignPatterns.StrategyPattern.DrivingStrategies.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Vroom Vroom.. Driving in Normal Mode");
    }
}