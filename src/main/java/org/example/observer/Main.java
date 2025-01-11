package org.example.observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();

        IObserver app = new WeatherApp(ws);
        IObserver site = new WeatherSite(ws);

        try {
            ws.setTemperature(25);
            Thread.sleep(1000);
            ws.setTemperature(35);

            ws.removeObserver(site);
            Thread.sleep(1000);
            ws.setTemperature(45);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }


}
