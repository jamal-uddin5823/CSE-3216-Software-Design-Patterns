package org.example.factory;

public class Main {
    public static void main(String[] args) {
        FactoryInterface factory = new RandomPositionAsteroidFactory(20,256,256);
        FactoryInterface factory2 = new RandomSizeAsteroidFactory(20,20,30);
        FactoryInterface earthfactory = new EarthFactory(10,20);
        FactoryInterface planetfactory = new InHabitablePlanetFactory(20,10);

        for (int i = 0; i < 10; i++) {
            ObstacleInterface asteroid = factory2.createObstacle();
            System.out.println(asteroid);
        }

        System.out.println(earthfactory.createObstacle());
        System.out.println(planetfactory.createObstacle());
    }
}
