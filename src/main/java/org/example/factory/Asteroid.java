package org.example.factory;

public class Asteroid implements ObstacleInterface {
    private final int x;
    private final int y;
    private final int size;

    public Asteroid(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    @Override
    public int[] getPosition() {
        return new int[]{x, y};
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Asteroid{" +
                "x=" + x +
                ", y=" + y +
                ", size=" + size +
                '}';
    }
}
