package org.example.strategy.after;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(
                new DuckFlyStrategyB(),
                new DuckEatStrategyA()
        );
    }

    @Override
    public void display() {
        System.out.println("Rubber Duck Display");
    }
}
