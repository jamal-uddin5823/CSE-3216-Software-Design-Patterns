package org.example.observer.after;

public class WeatherApp implements IObserver, IDisplay{
    WeatherStation weatherStation;
    int temperature;

    public WeatherApp(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("App showing temperature: " + temperature);
    }

    @Override
    public void update() {
        temperature = weatherStation.getTemperature();
        display();
    }
}
