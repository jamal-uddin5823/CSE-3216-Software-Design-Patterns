package org.example.strategy.after;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MountainDuck();
        duck.display();
        duck.fly();
        duck.eat();

        Duck duck2 = new CloudDuck();
        duck2.display();
        duck2.fly();
        duck2.eat();

        Duck duck3 = new RubberDuck();
        duck3.display();
        duck3.fly();
        duck3.eat();

        Duck duck4 = new Duck(
                () -> System.out.println("Lambda fly"),
                () -> System.out.println("Lambda eat")
        );

        duck4.display();
        duck4.fly();
        duck4.eat();
    }

}
