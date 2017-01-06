package uk.co.birchlabs.touhouwalk.services.walker;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.PreferenceManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import uk.co.birchlabs.touhouwalk.R;
import uk.co.birchlabs.touhouwalk.global.Variables;

/**
 * Created by birch on 01/01/2017.
 */

public class GensoukyouFactory {
    private final int widthPixels;
    private final int heightPixels;
    private final Context context;

    private final List<SpawnRegion> spawnRegions;
    private final int spriteScale;

    private final Random randomGenerator;

    public GensoukyouFactory(
            int widthPixels,
            int heightPixels,
            Context context
    ) {
        this.widthPixels = widthPixels;
        this.heightPixels = heightPixels;
        this.context = context;

        final SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);

        spriteScale = prefs.getInt(Variables.sprite_scale, 2);

        spawnRegions = new ArrayList<>();
        if (prefs.getBoolean(Variables.spawn_checkbox_top, true)) {
            spawnRegions.add(SpawnRegion.Top);
        }
        if (prefs.getBoolean(Variables.spawn_checkbox_bottom, true)) {
            spawnRegions.add(SpawnRegion.Bottom);
        }

        randomGenerator = new Random();
    }

    public Gensoukyou construct() {
        final Resources resources = context.getResources();

        final Gensoukyou gensoukyou = new Gensoukyou(
                widthPixels,
                heightPixels
        );

        final BakaFactory bakaFactory = new BakaFactory(
                3,
                4,
                spriteScale,
                gensoukyou,
                resources,
                new LinearAnimationTiming(3, 500)
        );

        gensoukyou.addBaka(
                constructBaka(
                        R.drawable.reimu,
                        bakaFactory
                )
        );
        gensoukyou.addBaka(
                constructBaka(
                        R.drawable.sanae,
                        bakaFactory
                )
        );
        gensoukyou.addBaka(
                constructBaka(
                        R.drawable.marisa,
                        bakaFactory
                )
        );
        gensoukyou.addBaka(
                constructBaka(
                        R.drawable.aya,
                        bakaFactory
                )
        );
        gensoukyou.addBaka(
                constructBaka(
                        R.drawable.chirno,
                        bakaFactory
                )
        );
        gensoukyou.addBaka(
                constructBaka(
                        R.drawable.kokoro,
                        bakaFactory
                )
        );
        return gensoukyou;
    }

    private Baka constructBaka(
            int baka,
            BakaFactory bakaFactory
    ) {
        return bakaFactory.construct(
                baka,
                spawnRegions.get(randomGenerator.nextInt(spawnRegions.size()))
        );
    }
}
