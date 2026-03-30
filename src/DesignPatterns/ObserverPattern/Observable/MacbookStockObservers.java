package DesignPatterns.ObserverPattern.Observable;

import DesignPatterns.ObserverPattern.Observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class MacbookStockObservers implements IObservable{
    private static List<IObserver> observers = new ArrayList<>();
    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers(String message) {
        for(IObserver observer: observers) {
            observer.updateMe(message);
        }
    }
}