package org.example.decorator;

public class Soy extends AddonDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 1;
    }
}
