package DesignPatterns.FactoryPattern.Vehicle;

public class Car implements VehicleProduct{
    @Override
    public String getName() {
        return "BMW 320D";
    }

    @Override
    public void run() {
        System.out.println("BMW 320D Running!!!");
    }
}
