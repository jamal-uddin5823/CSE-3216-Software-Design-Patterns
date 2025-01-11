package org.example.strategy.after;

public class CloudDuck extends Duck {
    public CloudDuck() {
        super(
                new DuckFlyStrategyA(),
                new DuckEatStrategyB()
        );
    }

    @Override
    public void display() {
        System.out.println("Cloud Duck Display");
    }
}
