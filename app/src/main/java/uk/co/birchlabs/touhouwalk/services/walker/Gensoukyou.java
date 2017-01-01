package uk.co.birchlabs.touhouwalk.services.walker;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by birch on 01/01/2017.
 */

public class Gensoukyou {
    private final int widthPixels;
    private final int heightPixels;
    private final Set<Baka> bakas;

    public Gensoukyou(
            int widthPixels,
            int heightPixels
    ) {
        bakas = new TreeSet<>(new Comparator<Baka>() {
            @Override
            public int compare(Baka baka, Baka t1) {
                int cmp = Integer.compare(
                        baka.getY(),
                        t1.getY()
                );
                if (cmp == 0) {
                    cmp = Integer.compare(
                            baka.getX(),
                            t1.getX()
                    );
                }
                if (cmp == 0) {
                    // or use System.identityHashCode()
                    cmp = Integer.compare(
                            baka.hashCode(),
                            t1.hashCode()
                    );
                }
                return cmp == 0
                        ? 1
                        : cmp; // returning 0 is a bad idea.
            }
        });
        this.widthPixels = widthPixels;
        this.heightPixels = heightPixels;
    }

    public void addBaka(Baka baka) {
        bakas.add(baka);
    }

    public Iterable<Baka> getBakas() {
        return bakas;
    }

    public int getWidthPixels() {
        return widthPixels;
    }

    public int getHeightPixels() {
        return heightPixels;
    }
}
