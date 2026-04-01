package DesignPatterns.AbstractFactoryPattern.CarFactories;

import DesignPatterns.AbstractFactoryPattern.CarParts.Body;
import DesignPatterns.AbstractFactoryPattern.CarParts.Engine;
import DesignPatterns.AbstractFactoryPattern.CarParts.Seats;
import DesignPatterns.AbstractFactoryPattern.CarParts.Tyres;

public interface CarFactory {
    public Engine manufactureEngine();
    public Tyres manufactureTyre();
    public Body manufactureBody();
    public Seats manufactureSeats();
}
