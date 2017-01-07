package uk.co.birchlabs.touhouwalk.services.walker;

import android.graphics.Rect;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by birch on 01/01/2017.
 */

public class SpritesheetRowToAnimation {
    private final Spritesheet spritesheet;

    public SpritesheetRowToAnimation(Spritesheet spritesheet) {
        this.spritesheet = spritesheet;
    }

    public Animation extract(int y, int height, int columns) {
        final List<Rect> frames = new ArrayList<>();
        final int width = spritesheet.getScaled().getWidth()/columns;
        for(int column = 0; column < columns; column++) {
            int x = column * width;
            frames.add(
                    new Rect(
                           x,
                           y,
                           x + width,
                           y + height
                    )
            );
        }
        return new Animation(frames);
    }
}
