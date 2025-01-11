package org.example.observer.after;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable{

    private final List<IObserver> subscribers;
    private int temperature;

    public WeatherStation() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : subscribers) {
            observer.update();
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
