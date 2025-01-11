package org.example.observer.after;

import java.util.ArrayList;
import java.util.List;

public class Observable implements IObservable {

    private List<IObserver> observers;
    Object state;

    public Observable(Object state) {
        this.observers = new ArrayList<>();
        this.state = state;
    }

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(IObserver observer : observers) {
            observer.update();
        }
    }

    public Object getState() {
        return this.state;
    }

    public void setState(Object state) {
        this.state = state;
        this.notifyObservers();
    }
}
