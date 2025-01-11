package org.example.strategy.after;

public class Duck {
    DuckFlyStrategy fly;
    DuckEatStrategy eat;

    public Duck(DuckFlyStrategy fly, DuckEatStrategy eat) {
        this.fly = fly;
        this.eat = eat;
    }

    public void display() {
        System.out.println("Duck Display");
    }

    public void fly() {
        fly.fly();
    }

    public void eat() {
        eat.eat();
    }
}
