package DesignPatterns.AbstractFactoryPattern;

import DesignPatterns.AbstractFactoryPattern.CarFactories.EconomyCarFactory;
import DesignPatterns.AbstractFactoryPattern.CarFactories.LuxuryCarFactory;

public class Retailer {
    public static Car buyCar(String type) {
        if(type.equals(CarTypes.ECONOMY.getValue())) {
            return new Car(new EconomyCarFactory());
        }
        else if (type.equals(CarTypes.LUXURY.getValue())) {
            return new Car(new LuxuryCarFactory());
        }
        else {
            throw new IllegalArgumentException("This type of car we don't manufacture");
        }
    }
}
