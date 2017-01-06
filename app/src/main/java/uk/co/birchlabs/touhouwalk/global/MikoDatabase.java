package uk.co.birchlabs.touhouwalk.global;

import android.util.SparseArray;

import java.util.ArrayList;
import java.util.List;

import uk.co.birchlabs.touhouwalk.R;

/**
 * Created by birch on 06/01/2017.
 */

public class MikoDatabase {
    private static final List<Integer> resourceIDs;
    private static final SparseArray<Miko> mikobase;

    static {
        mikobase = new SparseArray<>();
        resourceIDs = new ArrayList<>();
        addMiko(
                R.drawable.aya,
                new Miko(
                        R.drawable.aya,
                        "aya",
                        "Aya Shameimaru",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.chirno,
                new Miko(
                        R.drawable.chirno,
                        "chirno",
                        "Cirno",
                        "チルノ"
                )
        );
    }

    private static void addMiko(int resourceId, Miko miko) {
        mikobase.put(
                resourceId,
                miko
        );
        resourceIDs.add(resourceId);
    }

    public static Miko getMiko(int resourceId) {
        return mikobase.get(resourceId);
    }

    public static Integer[] getResourceIDs() {
        return resourceIDs.toArray(new Integer[resourceIDs.size()]);
    }
}
