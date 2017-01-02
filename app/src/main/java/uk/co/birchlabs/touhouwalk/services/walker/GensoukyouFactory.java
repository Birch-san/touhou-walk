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
    private final BakaFactory bakaFactory;

    public GensoukyouFactory(
            int widthPixels,
            int heightPixels,
            Resources resources
    ) {
        this.widthPixels = widthPixels;
        this.heightPixels = heightPixels;
        bakaFactory = new BakaFactory(
                3,
                4,
                2,
                widthPixels,
                heightPixels,
                resources,
                new LinearAnimationTiming(3, 500)
        );
    }

    public Gensoukyou construct() {
        final Gensoukyou gensoukyou = new Gensoukyou(
                widthPixels,
                heightPixels
        );
        gensoukyou.addBaka(
                bakaFactory.construct(
                        R.drawable.reimu,
                        SpawnRegion.Top
                )
        );
        gensoukyou.addBaka(
                bakaFactory.construct(
                        R.drawable.sanae,
                        SpawnRegion.Bottom
                )
        );
        gensoukyou.addBaka(
                bakaFactory.construct(
                        R.drawable.marisa,
                        SpawnRegion.Bottom
                )
        );
        gensoukyou.addBaka(
                bakaFactory.construct(
                        R.drawable.aya,
                        SpawnRegion.Bottom
                )
        );
        gensoukyou.addBaka(
                bakaFactory.construct(
                        R.drawable.chirno,
                        SpawnRegion.Bottom
                )
        );
        gensoukyou.addBaka(
                bakaFactory.construct(
                        R.drawable.kokoro,
                        SpawnRegion.Bottom
                )
        );
        return gensoukyou;
    }
}
