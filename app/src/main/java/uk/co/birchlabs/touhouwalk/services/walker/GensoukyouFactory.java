package uk.co.birchlabs.touhouwalk.services.walker;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import uk.co.birchlabs.touhouwalk.R;

/**
 * Created by birch on 01/01/2017.
 */

public class GensoukyouFactory {
    private final int widthPixels;
    private final int heightPixels;
    private final Resources resources;

    public GensoukyouFactory(
            int widthPixels,
            int heightPixels,
            Resources resources
    ) {
        this.widthPixels = widthPixels;
        this.heightPixels = heightPixels;
        this.resources = resources;
    }

    public Gensoukyou construct() {
        final Gensoukyou gensoukyou = new Gensoukyou(
                widthPixels,
                heightPixels
        );
        final Baka baka = new Baka(
                0f,
                0f,
                new Spritesheet(
                        getRawBmp(
                                R.drawable.reimu
                        ),
                        3,
                        4,
                        2
                ),
                new LinearAnimationTiming(3, 500)
        );
        gensoukyou.addBaka(baka);
        return gensoukyou;
    }

    private Bitmap getRawBmp(
            int id
    ) {
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        return BitmapFactory.decodeResource(
                resources,
                id,
                options
        );
    }
}
