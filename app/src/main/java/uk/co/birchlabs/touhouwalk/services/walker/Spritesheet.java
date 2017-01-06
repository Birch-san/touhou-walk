package uk.co.birchlabs.touhouwalk.services.walker;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import uk.co.birchlabs.touhouwalk.global.BitmapUtils;

/**
 * Created by birch on 01/01/2017.
 */

public class Spritesheet {

    private final int scaleFactor;
    private final Bitmap scaled;

    public Spritesheet(
            Bitmap nominal,
            int scaleFactor
    ) {
        this.scaleFactor = scaleFactor;
        this.scaled = BitmapUtils.resizeBitmap(
                nominal,
                scaleFactor
        );
    }

    public Bitmap getScaled() {
        return scaled;
    }

    public int getScaleFactor() {
        return scaleFactor;
    }
}
