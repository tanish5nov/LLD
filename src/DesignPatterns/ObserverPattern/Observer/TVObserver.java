package DesignPatterns.ObserverPattern.Observer;

public class TVObserver implements IObserver {
    @Override
    public void updateMe(String message) {
        System.out.println("Notification from Observer to: " + getClass().getName() + " , message: " + message);
    }
}
