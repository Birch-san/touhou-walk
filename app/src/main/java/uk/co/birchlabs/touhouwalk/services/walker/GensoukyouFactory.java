package uk.co.birchlabs.touhouwalk.services.walker;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.PreferenceManager;

import uk.co.birchlabs.touhouwalk.R;
import uk.co.birchlabs.touhouwalk.global.Variables;

/**
 * Created by birch on 01/01/2017.
 */

public class GensoukyouFactory {
    private final int widthPixels;
    private final int heightPixels;
    private final Context context;

    public GensoukyouFactory(
            int widthPixels,
            int heightPixels,
            Context context
    ) {
        this.widthPixels = widthPixels;
        this.heightPixels = heightPixels;
        this.context = context;
    }

    public Gensoukyou construct() {
        final Resources resources = context.getResources();
        final SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        final Gensoukyou gensoukyou = new Gensoukyou(
                widthPixels,
                heightPixels
        );

        final BakaFactory bakaFactory = new BakaFactory(
                3,
                4,
                prefs.getInt(Variables.sprite_scale, 2),
                gensoukyou,
                resources,
                new LinearAnimationTiming(3, 500)
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
