package uk.co.birchlabs.touhouwalk.services.walker;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import uk.co.birchlabs.touhouwalk.global.BitmapUtils;

/**
 * Created by birch on 02/01/2017.
 */

public class BakaFactory {

    private final int scaleFactor;
    private final Gensoukyou gensoukyou;
    private final Resources resources;
    private final AnimationTiming animationTiming;

    public BakaFactory(
            int scaleFactor,
            Gensoukyou gensoukyou,
            Resources resources,
            AnimationTiming animationTiming
    ) {
        this.scaleFactor = scaleFactor;
        this.gensoukyou = gensoukyou;
        this.resources = resources;
        this.animationTiming = animationTiming;
    }

    public Baka construct(
            int baka,
            SpawnRegion spawnRegion
    ) {
        double speed = 15 + Math.random() * 20.0d;
        final Baka nominalBaka = new Baka(
                Double.valueOf(speed).floatValue(),
                new Spritesheet(
                        getRawBmp(
                                baka
                        ),
                        scaleFactor
                ),
                new LinearAnimationTiming(3, Double.valueOf(500 + speed * 4).intValue()),
                spawnRegion.toYAxisOrientation()
        );
//        if (spawnRegion == SpawnRegion.Bottom) {
//            nominalBaka.setY(gensoukyou.getHeightPixels() - nominalBaka.getFrame().height());
//        }
        nominalBaka.setX(
                Double.valueOf(
                        - nominalBaka.getFrame().width() + Math.random() * (gensoukyou.getWidthPixels() + nominalBaka.getFrame().width())
                ).floatValue()
        );
        return nominalBaka;
    }

    private Bitmap getRawBmp(
            int id
    ) {
        return BitmapUtils.getRawBmp(
                id,
                resources
        );
    }

}
