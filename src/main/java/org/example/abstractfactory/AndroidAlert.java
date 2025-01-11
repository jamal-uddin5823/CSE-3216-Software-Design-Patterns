package org.example.abstractfactory;

public class AndroidAlert implements AlertInterface{
    @Override
    public void alert() {
        System.out.println("Android Alert");
    }
}
