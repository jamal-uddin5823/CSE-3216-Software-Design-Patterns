package org.example.strategy.after;

public class DuckFlyStrategyB implements DuckFlyStrategy {
    @Override
    public void fly() {
        System.out.println("Flying in Strategy B");
    }
}
