package uk.co.birchlabs.touhouwalk.services.walker;

import android.graphics.Bitmap;
import android.graphics.Rect;

/**
 * Created by birch on 01/01/2017.
 */

public class Baka {
    private float x = 0.0f;
    private float y = 0.0f;

    private float distancePerSec = 1.0f;
    private float distancePerMilli = distancePerSec/1000;

    private final int spriteWidth = 32;
    private final int spriteHeight = 32;

    private Bearing bearing;

    private final Spritesheet spritesheet;

    public Baka(
            float x,
            float y,
            Spritesheet spritesheet
    ) {
        this.x = x;
        this.y = y;
        bearing = Bearing.RIGHT;
        this.spritesheet = spritesheet;
    }

    public void tick(long delta) {
        float distanceThisTick = distancePerMilli * delta;
        x += distanceThisTick * bearing.getXCoefficient();
        y += distanceThisTick * bearing.getYCoefficient();
    }

    public Bitmap getBitmap() {
        return spritesheet.getScaled();
    }


    public Rect getFrame() {
        return new Rect(
                0,
                0,
                32 * spritesheet.getScaleFactor(),
                32 * spritesheet.getScaleFactor()
        );
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getSpriteWidth() {
        return spriteWidth;
    }

    public int getSpriteHeight() {
        return spriteHeight;
    }

    public Rect getDestination() {
        int roundedX = Math.round(this.x);
        int roundedY = Math.round(this.y);

        return new Rect(
                roundedX,
                roundedY,
                roundedX + spriteWidth * spritesheet.getScaleFactor(),
                roundedY + spriteHeight * spritesheet.getScaleFactor()
        );
    }
}
