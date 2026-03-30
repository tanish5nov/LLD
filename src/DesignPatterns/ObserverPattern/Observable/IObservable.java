package DesignPatterns.ObserverPattern.Observable;

import DesignPatterns.ObserverPattern.Observer.IObserver;

public interface IObservable {
    public void addObserver(IObserver observer);
    public void removeObserver(IObserver observer);
    public void notifyObservers(String message);
}