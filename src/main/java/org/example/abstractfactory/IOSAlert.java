package org.example.abstractfactory;

public class IOSAlert implements AlertInterface {
    @Override
    public void alert() {
        System.out.println("iOS Alert");
    }
}
