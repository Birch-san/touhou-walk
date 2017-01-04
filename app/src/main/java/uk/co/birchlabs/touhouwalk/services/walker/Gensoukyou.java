package uk.co.birchlabs.touhouwalk.services.walker;

import android.content.res.Configuration;

import java.util.Comparator;
import java.util.EnumSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by birch on 01/01/2017.
 */

public class Gensoukyou {
    private int widthPixels;
    private int heightPixels;
    private final Set<Baka> bakas;
    private Orientation orientation;

    public Gensoukyou(
            Orientation orientation,
            int widthPixels,
            int heightPixels
    ) {
        this.orientation = orientation;
        bakas = new TreeSet<>(new Comparator<Baka>() {
            @Override
            public int compare(Baka baka, Baka t1) {
                int cmp = Float.compare(
                        baka.getY(),
                        t1.getY()
                );
                if (cmp == 0) {
                    cmp = Float.compare(
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

    public ServiceEventHandler getServiceEventHandler() {
        return new ServiceEventHandler() {
            @Override
            public void onDestroyed() {

            }

            @Override
            public void onConfigurationChanged(Configuration newConfig) {
                final Orientation prevOrientation = Orientation.toOrientation(newConfig);
                Gensoukyou.this.orientation = Orientation.toOrientation(newConfig);

                if (EnumSet.of(Orientation.Square, Orientation.Undefined).contains(prevOrientation)) {
                    // let's not handle these weird cases
                    return;
                }

                if (EnumSet.of(Orientation.Square, Orientation.Undefined).contains(Gensoukyou.this.orientation)) {
                    // let's not handle these weird cases
                    return;
                }

                if (prevOrientation != Gensoukyou.this.orientation) {
                    final int temp = widthPixels;
                    widthPixels = heightPixels;
                    heightPixels = temp;
                }
            }
        };
    }
}
