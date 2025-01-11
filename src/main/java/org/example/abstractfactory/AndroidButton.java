package org.example.abstractfactory;



public class AndroidButton implements ButtonInterface {
    @Override
    public void press() {
        System.out.println("Android Button");
    }
}
