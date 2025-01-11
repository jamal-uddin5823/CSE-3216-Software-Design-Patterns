package org.example.decorator;

public class Caramel extends AddonDecorator {
    Beverage beverage;

    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 2;
    }
}
