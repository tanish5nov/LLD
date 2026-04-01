package DesignPatterns.AbstractFactoryPattern.CarFactories;

import DesignPatterns.AbstractFactoryPattern.CarParts.*;

public class LuxuryCarFactory implements CarFactory{
    @Override
    public Engine manufactureEngine(){
        return new LuxuryEngine();
    }

    @Override
    public Tyres manufactureTyre() {
        return new LuxuryTyres();
    }

    @Override
    public Body manufactureBody() {
        return new LuxuryBody();
    }

    @Override
    public Seats manufactureSeats() {
        return new LuxurySeats();
    }
}