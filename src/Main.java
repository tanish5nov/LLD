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
        IObservable iPhoneStockObservers = new IPhoneStockObservers();
        IObservable macbookStockObservers = new MacbookStockObservers();
        IObserver user = new UserObserver();
        IObserver tv = new TVObserver();
        IObserver display = new DisplayObserver();

        iPhoneStockObservers.addObserver(user);
        iPhoneStockObservers.addObserver(tv);

        macbookStockObservers.addObserver(user);
        macbookStockObservers.addObserver(display);

        iPhoneStockObservers.notifyObservers("Hello iphone stocks are back");
        macbookStockObservers.notifyObservers("Hello macbook stocks are back");

        iPhoneStockObservers.removeObserver(user);
        System.out.println("After removal of user from iphonestockobserver");
        iPhoneStockObservers.notifyObservers("Hello iphone stocks are back");
    }
}