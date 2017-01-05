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

    public Gensoukyou(
            int widthPixels,
            int heightPixels
    ) {
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

    public ViewEventHandler getViewEventHandler() {
        return new ViewEventHandler() {
            @Override
            public void onReady() {
            }

            @Override
            public void onSizeChanged(int w, int h, int oldw, int oldh) {
                widthPixels = w;
                heightPixels = h;
            }
        };
    }
}
