package org.example.factory;

public class Planet implements ObstacleInterface {
    private final int x;
    private final int y;
    private final int size;
    private final boolean isHabitable;

    public Planet(int x, int y, int size, boolean isHabitable) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.isHabitable = isHabitable;
    }

    @Override
    public int[] getPosition() {
        return new int[] {x, y};
    }

    @Override
    public int getSize() {
        return size;
    }

    public boolean isHabitable() {
        return isHabitable;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "x=" + x +
                ", y=" + y +
                ", size=" + size +
                ", isHabitable=" + isHabitable +
                '}';
    }
}
