package uk.co.birchlabs.touhouwalk.services.walker;

/**
 * Created by birch on 01/01/2017.
 */

public enum Bearing {
    DOWN(0, 1),
    LEFT(-1, 0),
    RIGHT(1, 0),
    UP(0, -1);

    final int xCoefficient;
    final int yCoefficient;

    Bearing(int xCoefficient, int yCoefficient) {
        this.xCoefficient = xCoefficient;
        this.yCoefficient = yCoefficient;
    }

    public int getXCoefficient() {
        return xCoefficient;
    }

    public int getYCoefficient() {
        return yCoefficient;
    }
}
