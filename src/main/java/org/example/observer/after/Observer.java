package org.example.observer.after;

public class Observer implements IObserver{
    Observable observable;

    public Observer(Observable observable) {
        this.observable = observable;
        observable.registerObserver(this);
    }

    @Override
    public void update() {
        Object state = observable.getState();
        System.out.println("State: " + state);
    }
}
