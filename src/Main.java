import DesignPatterns.AbstractFactoryPattern.Car;
import DesignPatterns.AbstractFactoryPattern.CarFactories.CarFactory;
import DesignPatterns.AbstractFactoryPattern.CarFactories.EconomyCarFactory;
import DesignPatterns.AbstractFactoryPattern.CarFactories.LuxuryCarFactory;
import DesignPatterns.AbstractFactoryPattern.CarTypes;
import DesignPatterns.AbstractFactoryPattern.Retailer;
import DesignPatterns.DecoratorPattern.BasePizza.AbstractBasePizza;
import DesignPatterns.DecoratorPattern.BasePizza.FarmhousePizza;
import DesignPatterns.DecoratorPattern.BasePizza.MargheritaPizza;
import DesignPatterns.DecoratorPattern.PizzaDecorator.ExtraCheese;
import DesignPatterns.DecoratorPattern.PizzaDecorator.ExtraMushroom;
import DesignPatterns.DecoratorPattern.PizzaDecorator.ExtraOregano;
import DesignPatterns.FactoryPattern.Factory.VehicleFactory;
import DesignPatterns.FactoryPattern.Vehicle.VehicleProduct;
import DesignPatterns.ObserverPattern.Observable.IObservable;
import DesignPatterns.ObserverPattern.Observable.IPhoneStockObservers;
import DesignPatterns.ObserverPattern.Observable.MacbookStockObservers;
import DesignPatterns.ObserverPattern.Observer.DisplayObserver;
import DesignPatterns.ObserverPattern.Observer.IObserver;
import DesignPatterns.ObserverPattern.Observer.TVObserver;
import DesignPatterns.ObserverPattern.Observer.UserObserver;
import DesignPatterns.StrategyPattern.OffroadVehicle;
import DesignPatterns.StrategyPattern.Vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
//        Vehicle vehicle = new OffroadVehicle();
//        vehicle.drive();
//        // dummy commit
//        IObservable iPhoneStockObservers = new IPhoneStockObservers();
//        IObservable macbookStockObservers = new MacbookStockObservers();
//        IObserver user = new UserObserver();
//        IObserver tv = new TVObserver();
//        IObserver display = new DisplayObserver();
//
//        iPhoneStockObservers.addObserver(user);
//        iPhoneStockObservers.addObserver(tv);
//
//        macbookStockObservers.addObserver(user);
//        macbookStockObservers.addObserver(display);
//
//        iPhoneStockObservers.notifyObservers("Hello iphone stocks are back");
//        macbookStockObservers.notifyObservers("Hello macbook stocks are back");
//
//        iPhoneStockObservers.removeObserver(user);
//        System.out.println("After removal of user from iphonestockobserver");
//        iPhoneStockObservers.notifyObservers("Hello iphone stocks are back");

//        AbstractBasePizza pizza = new MargheritaPizza();
//        pizza = new ExtraCheese(pizza);
//        pizza = new ExtraMushroom(pizza);
//        pizza = new ExtraOregano(pizza);
//        System.out.println("The final cost of Pizza is: " + pizza.cost());

//        VehicleProduct bike = VehicleFactory.createVehicle("Bike");
//        bike.run();
//        System.out.println(bike.getName());
//        VehicleProduct car = VehicleFactory.createVehicle("Car");
//        car.run();;
//        System.out.println(car.getName());
//        VehicleProduct truck = VehicleFactory.createVehicle("truck");

        Car economy = Retailer.buyCar(CarTypes.ECONOMY.getValue());
        Car luxury = Retailer.buyCar(CarTypes.LUXURY.getValue());

        System.out.println(economy.checkTyres());
        System.out.println(economy.checkEngine());
        System.out.println(luxury.checkEngine());
        System.out.println(luxury.checkSeats());
    }
}