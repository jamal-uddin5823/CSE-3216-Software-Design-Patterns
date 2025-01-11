package org.example.strategy.before;

public class Main {
    public static void main(String[] args) {
        Duck duck = new RubberDuck();
        duck.display();
        duck.quack();
        duck.fly();
        duck.eat();
    }
}
