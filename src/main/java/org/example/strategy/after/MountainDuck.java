package org.example.strategy.after;

public class MountainDuck extends Duck {
    public MountainDuck() {
        super(
                new DuckFlyStrategyA(),
                new DuckEatStrategyA()
        );
    }

    @Override
    public void display() {
        System.out.println("Mountain Duck Display");
    }
}
