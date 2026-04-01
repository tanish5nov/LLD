package DesignPatterns.AbstractFactoryPattern;

import DesignPatterns.AbstractFactoryPattern.CarFactories.CarFactory;
import DesignPatterns.AbstractFactoryPattern.CarFactories.EconomyCarFactory;
import DesignPatterns.AbstractFactoryPattern.CarFactories.LuxuryCarFactory;
import DesignPatterns.AbstractFactoryPattern.CarParts.*;

public class Car {
    public Engine engine;
    public Tyres tyres;
    public Body body;
    public Seats seats;
    public CarFactory carFactory;

    public Car(CarFactory carFactory) {
        this.carFactory =  carFactory;
        this.engine = carFactory.manufactureEngine();
        this.seats = carFactory.manufactureSeats();
        this.tyres = carFactory.manufactureTyre();
        this.body = carFactory.manufactureBody();
    }

    public String checkBody() {
        return this.body.shine();
    }

    public String checkEngine() {
        return this.engine.run();
    }

    public String checkTyres() {
        return this.tyres.tyreType();
    }

    public String checkSeats() {
        return this.seats.seatsColour();
    }
}
