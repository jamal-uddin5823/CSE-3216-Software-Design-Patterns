package org.example.strategy.before;

public class RubberDuck extends DuckEatingWithStyleA {
    @Override
    public void display() {
        System.out.println("Rubber Duck Display");
    }

    @Override
    public void fly() {
        System.out.println("Cannot fly");
    }
}
