package DesignPatterns.FactoryPattern.Vehicle;

public class Bike implements VehicleProduct{
    @Override
    public String getName() {
        return "BMW G310R";
    }

    @Override
    public void run() {
        System.out.println("BMW G310R Running!!!");
    }
}