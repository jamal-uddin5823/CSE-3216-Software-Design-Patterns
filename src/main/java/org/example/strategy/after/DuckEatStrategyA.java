package org.example.strategy.after;

public class DuckEatStrategyA implements DuckEatStrategy {
    @Override
    public void eat() {
        System.out.println("Eating in strategy A");
    }
}
