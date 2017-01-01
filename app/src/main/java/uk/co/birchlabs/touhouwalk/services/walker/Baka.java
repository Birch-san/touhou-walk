package uk.co.birchlabs.touhouwalk.services.walker;

/**
 * Created by birch on 01/01/2017.
 */

public class Baka {
    private float x;
    private float y;

    private float distancePerSec = 1.0f;
    private float distancePerMilli = distancePerSec/1000;

    private Bearing bearing;

    public Baka(
            float x,
            float y
    ) {
        this.x = x;
        this.y = y;
        bearing = Bearing.RIGHT;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void tick(long delta) {
        float distanceThisTick = distancePerMilli * delta;
        x += distanceThisTick * bearing.getXCoefficient();
        y += distanceThisTick * bearing.getYCoefficient();
    }

}
