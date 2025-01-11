package org.example.abstractfactory;

public class IOSButton implements ButtonInterface {
    @Override
    public void press() {
        System.out.println("iOS Button");
    }
}
