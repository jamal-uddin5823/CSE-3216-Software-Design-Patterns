package org.example.factory;

import java.util.Random;

public class RandomSizeAsteroidFactory implements FactoryInterface{
    private final int maxSize;
    private final int x;
    private final int y;

    public RandomSizeAsteroidFactory(int x, int y, int maxSize) {
        this.x = x;
        this.y = y;
        this.maxSize = maxSize;
    }

    @Override
    public ObstacleInterface createObstacle() {
        Random rand = new Random();

        int size = rand.nextInt(maxSize) + 1;

        return new Asteroid(x,y,size);
    }
}
