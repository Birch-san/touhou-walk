package uk.co.birchlabs.touhouwalk.services.walker;

import android.content.res.Configuration;

/**
 * Created by birch on 03/01/2017.
 */

public enum Orientation {
    Undefined,
    Portrait,
    Landscape,
    Square;

    private static final Orientation[] mapping = new Orientation[]{ Undefined, Portrait, Landscape, Square };

    public static Orientation toOrientation(Configuration configuration) {
        return mapping[configuration.orientation];
    }
}
