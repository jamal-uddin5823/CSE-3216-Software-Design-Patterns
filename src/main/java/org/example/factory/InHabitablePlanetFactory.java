package org.example.factory;

import java.util.Random;

public class InHabitablePlanetFactory implements FactoryInterface {
    private final int x;
    private final int y;
    private final int size=200;

    public InHabitablePlanetFactory(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public ObstacleInterface createObstacle() {
        boolean isHabitable = false;
        return new Planet(x, y, size, isHabitable);
    }
}
