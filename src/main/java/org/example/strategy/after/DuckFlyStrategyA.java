package org.example.strategy.after;

public class DuckFlyStrategyA implements DuckFlyStrategy {
    @Override
    public void fly() {
        System.out.println("Flying in Strategy A");
    }
}
