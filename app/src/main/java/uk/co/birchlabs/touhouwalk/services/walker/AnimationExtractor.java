package uk.co.birchlabs.touhouwalk.services.walker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by birch on 01/01/2017.
 */

public class AnimationExtractor {
    private final Spritesheet spritesheet;

    public AnimationExtractor(Spritesheet spritesheet) {
        this.spritesheet = spritesheet;
    }

    public List<Animation> extract(int rows, int columns) {
        final List<Animation> animations = new ArrayList<>();
        final int height = spritesheet.getScaled().getHeight()/rows;
        final SpritesheetRowToAnimation spritesheetRowToAnimation = new SpritesheetRowToAnimation(spritesheet);
        for(int row = 0; row < rows; row++) {
            int y = row * height;
            animations.add(
                    spritesheetRowToAnimation.extract(
                            y,
                            height,
                            columns
                    )
            );
        }
        return animations;
    }
}
