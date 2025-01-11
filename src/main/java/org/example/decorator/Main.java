package org.example.decorator;

public class Main {
    public static void main(String[] args) {
       Beverage beverage = new Decaf();


       beverage = new Soy(beverage);
       beverage = new Caramel(beverage);

        System.out.println(beverage.getCost());
    }
}
