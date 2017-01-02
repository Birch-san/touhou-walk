package uk.co.birchlabs.touhouwalk.services.walker;

import android.graphics.Bitmap;
import android.graphics.Rect;

import java.util.Map;

/**
 * Created by birch on 01/01/2017.
 */

public class Baka {
    private float x = 0.0f;
    private float y = 0.0f;

    private float distancePerSec = 20.0f;
    private float distancePerMilli = distancePerSec/1000;

    private final int spriteWidth = 32;
    private final int spriteHeight = 32;

    private long lifetime = 0;

    private Bearing bearing;

    private final Spritesheet spritesheet;
    private final Map<Bearing, Animation> bearingToAnimation;
    private final AnimationTiming animationTiming;

    public Baka(
            float x,
            float y,
            Spritesheet spritesheet,
            AnimationTiming animationTiming
    ) {
        bearing = Bearing.RIGHT;
        this.spritesheet = spritesheet;
        this.x = x;
        this.y = y;
        bearingToAnimation = new BearingToAnimation(
                new AnimationExtractor(spritesheet).extract(4, 3)
        ).getAnimationMap();
        this.animationTiming = animationTiming;
    }

    public void tick(long delta) {
        lifetime += delta;
        float distanceThisTick = distancePerMilli * delta;
        x += distanceThisTick * bearing.getXCoefficient();
        y += distanceThisTick * bearing.getYCoefficient();
    }

    public Bitmap getBitmap() {
        return spritesheet.getScaled();
    }


    public Rect getFrame() {
        return bearingToAnimation.get(bearing).getFrames().get(getStepFrame());
    }

    private int getStepFrame() {
        return animationTiming.frame(lifetime);
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

    private int getScaledWidth() {
        return spriteWidth * spritesheet.getScaleFactor();
    }

    private int getScaledHeight() {
        return spriteHeight * spritesheet.getScaleFactor();
    }


    public Rect getDestination(int worldWidth, int worldHeight) {
        final int scaledWidth = getScaledWidth();
        final int scaledHeight = getScaledHeight();

        final int finalX = ((Math.round(this.x) + scaledWidth) % (worldWidth + scaledWidth)) - scaledWidth;
        final int finalY = ((Math.round(this.y) + scaledHeight) % (worldHeight + scaledHeight)) - scaledHeight;

        return new Rect(
                finalX,
                finalY,
                finalX + scaledWidth,
                finalY + scaledHeight
        );
    }
}
