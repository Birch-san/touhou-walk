package uk.co.birchlabs.touhouwalk.services.walker;

/**
 * Created by birch on 01/01/2017.
 */

public class GensoukyouFactory {
    private final int widthPixels;
    private final int heightPixels;

    public GensoukyouFactory(
            int widthPixels,
            int heightPixels
    ) {
        this.widthPixels = widthPixels;
        this.heightPixels = heightPixels;
    }

    public Gensoukyou construct() {
        final Gensoukyou gensoukyou = new Gensoukyou(
                widthPixels,
                heightPixels
        );
        final Baka baka = new Baka(0, 0);
        gensoukyou.addBaka(baka);
        return gensoukyou;
    }
}
