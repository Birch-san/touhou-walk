package uk.co.birchlabs.touhouwalk.global;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by birch on 06/01/2017.
 */

public class BitmapUtils {
    public static Bitmap getRawBmp(
            int id,
            Resources resources
    ) {
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        return BitmapFactory.decodeResource(
                resources,
                id,
                options
        );
    }

    public static Bitmap resizeBitmap(Bitmap bitmap, int multiplier) {
        return Bitmap.createScaledBitmap(
                bitmap,
                bitmap.getWidth() * multiplier,
                bitmap.getHeight() * multiplier,
                false
        );
    }
}
