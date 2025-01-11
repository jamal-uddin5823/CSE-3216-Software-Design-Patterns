package org.example.observer;

public interface IObservable {
    public void registerObserver(IObserver observer);
    public void removeObserver(IObserver observer);
    public void notifyObservers();
}
