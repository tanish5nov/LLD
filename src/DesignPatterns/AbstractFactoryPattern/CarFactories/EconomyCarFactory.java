package DesignPatterns.AbstractFactoryPattern.CarFactories;

import DesignPatterns.AbstractFactoryPattern.CarParts.*;

public class EconomyCarFactory implements CarFactory{
    @Override
    public Engine manufactureEngine(){
        return new EconomyEngine();
    }

    @Override
    public Tyres manufactureTyre() {
        return new EconomyTyres();
    }

    @Override
    public Body manufactureBody() {
        return new EconomyBody();
    }

    @Override
    public Seats manufactureSeats() {
        return new EconomySeats();
    }
}