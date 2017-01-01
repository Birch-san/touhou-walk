package uk.co.birchlabs.touhouwalk.services.walker;

import android.graphics.Rect;

import java.util.List;

/**
 * Created by birch on 01/01/2017.
 */

public class Animation {
    private List<Rect> frames;

    public Animation(
            List<Rect> frames
    ) {
        this.frames = frames;
    }

    public List<Rect> getFrames() {
        return frames;
    }
}
