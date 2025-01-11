package org.example.observer.after;

public interface IObservable {
    public void registerObserver(IObserver observer);
    public void removeObserver(IObserver observer);
    public void notifyObservers();
}
