package design.patterns.assignment2.observer;

import java.util.ArrayList;
import java.util.List;

public class OperationMonitor implements Subject {
private List<Observer> observers = new ArrayList<>();

    @Override
public void attach(Observer observer) {
        observers.add(observer);
    }

@Override
public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
public void notifyObservers(String status) {
    for (Observer observer : observers) {
            observer.update(status);
        }
    }
}
