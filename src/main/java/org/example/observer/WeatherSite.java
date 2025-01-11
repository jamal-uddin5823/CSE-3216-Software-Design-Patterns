package org.example.observer;

public class WeatherSite implements IObserver,IDisplay{
    WeatherStation weatherStation;
    int temperature;

    public WeatherSite(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Site showing temperature: " + temperature);
    }

    @Override
    public void update() {
        temperature = weatherStation.getTemperature();
        display();
    }
}
