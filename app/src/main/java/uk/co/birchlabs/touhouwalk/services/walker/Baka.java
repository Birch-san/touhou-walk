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

    private final float distancePerMilli;

    private long lifetime = 0;

    private Bearing bearing;

    private final Spritesheet spritesheet;
    private final Map<Bearing, Animation> bearingToAnimation;
    private final AnimationTiming animationTiming;

    private final BakaYPositionStrategy yPositionStrategy;

    public Baka(
            float distancePerSec,
            Spritesheet spritesheet,
            AnimationTiming animationTiming,
            AxisOrientation yAxisOrientation
    ) {
        bearing = Bearing.RIGHT;
        distancePerMilli =  distancePerSec/1000;
        this.spritesheet = spritesheet;
        bearingToAnimation = new BearingToAnimation(
                new AnimationExtractor(spritesheet).extract(4, 3)
        ).getAnimationMap();
        this.animationTiming = animationTiming;
        yPositionStrategy = BakaYPositionStrategyFactory.getStrategy(yAxisOrientation);
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

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Rect getDestination(int worldWidth, int worldHeight) {
        final int scaledWidth = getFrame().width();
        final int scaledHeight = getFrame().height();

        final int finalX = ((Math.round(this.x) + scaledWidth) % (worldWidth + scaledWidth)) - scaledWidth;
        final int finalY = yPositionStrategy.getYDest(
                worldHeight,
                this.y,
                scaledHeight
        );

        return new Rect(
                finalX,
                finalY,
                finalX + scaledWidth,
                finalY + scaledHeight
        );
    }
}
