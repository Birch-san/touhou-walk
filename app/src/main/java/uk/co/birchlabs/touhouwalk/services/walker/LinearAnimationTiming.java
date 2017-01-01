package uk.co.birchlabs.touhouwalk.services.walker;

/**
 * Created by birch on 01/01/2017.
 */

public class LinearAnimationTiming implements AnimationTiming {
    private final int totalFrames;
    private final int frameDurationMillis;

    public LinearAnimationTiming(int totalFrames, int frameDurationMillis) {
        this.totalFrames = totalFrames;
        this.frameDurationMillis = frameDurationMillis;
    }

    @Override
    public int frame(long now) {
        return (int)(now/frameDurationMillis) % totalFrames;
    }
}
