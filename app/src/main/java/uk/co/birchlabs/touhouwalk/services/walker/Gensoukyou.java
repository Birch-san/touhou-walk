package uk.co.birchlabs.touhouwalk.services.walker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by birch on 01/01/2017.
 */

public class Gensoukyou {
    private final int widthPixels;
    private final int heightPixels;
    private final List<Baka> bakas;

    public Gensoukyou(
            int widthPixels,
            int heightPixels
    ) {
        bakas = new ArrayList<>();
        this.widthPixels = widthPixels;
        this.heightPixels = heightPixels;
    }

    public void addBaka(Baka baka) {
        bakas.add(baka);
    }

    public List<Baka> getBakas() {
        return bakas;
    }

    public int getWidthPixels() {
        return widthPixels;
    }

    public int getHeightPixels() {
        return heightPixels;
    }
}
