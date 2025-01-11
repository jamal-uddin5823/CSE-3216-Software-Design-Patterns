package org.example.abstractfactory;

public class Main {
    public static void main(String[] args) {
        UIFactory androidUIFactory = new AndroidUIFactory();
        UIFactory iosUIFactory = new IOSUIFactory();

        androidUIFactory.createAlert();
        androidUIFactory.createButton();


        iosUIFactory.createAlert();
        iosUIFactory.createButton();

    }
}
