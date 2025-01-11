package org.example.factory;

import java.util.Random;

public class RandomPositionAsteroidFactory implements FactoryInterface{

    private final int size;
    private final int width;
    private final int height;

    public RandomPositionAsteroidFactory(int size, int width, int height) {
        this.size = size;
        this.width = width;
        this.height = height;
    }

    @Override
    public ObstacleInterface createObstacle() {
        Random rand = new Random();

        int x = rand.nextInt(width);
        int y = rand.nextInt(height);

        return new Asteroid(x,y,size);
    }
}
