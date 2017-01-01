package uk.co.birchlabs.touhouwalk.services.walker;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by birch on 01/01/2017.
 */

public class Spritesheet {
    private final int columns;
    private final int rows;

    private final int scaleFactor;

    private final Bitmap nominal;
    private final Bitmap scaled;

    public Spritesheet(
            Bitmap nominal,
            int columns,
            int rows,
            int scaleFactor
    ) {
        this.nominal = nominal;
        this.scaleFactor = scaleFactor;
        this.scaled = resizeBitmap(
                nominal,
                scaleFactor
        );
        this.columns = columns;
        this.rows = rows;
    }

    private Bitmap resizeBitmap(Bitmap bitmap, int multiplier) {
        return Bitmap.createScaledBitmap(
                bitmap,
                bitmap.getWidth() * multiplier,
                bitmap.getHeight() * multiplier,
                false
        );
    }

    public Bitmap getScaled() {
        return scaled;
    }

    public int getScaleFactor() {
        return scaleFactor;
    }
}
