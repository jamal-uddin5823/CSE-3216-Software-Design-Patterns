package org.example.factory;

import java.util.Random;

public class EarthFactory implements FactoryInterface{
    private final int x;
    private final int y;
    private final int size=100;

    public EarthFactory(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public ObstacleInterface createObstacle() {
        boolean isHabitable = true;
        return new Planet(x,y,size,isHabitable);
    }
}
