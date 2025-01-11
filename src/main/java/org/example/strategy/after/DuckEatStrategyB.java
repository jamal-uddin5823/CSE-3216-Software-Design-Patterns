package org.example.strategy.after;

public class DuckEatStrategyB implements DuckEatStrategy {
    @Override
    public void eat() {
        System.out.println("Eating in strategy B");
    }
}
