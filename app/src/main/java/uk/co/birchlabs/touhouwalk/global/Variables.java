package uk.co.birchlabs.touhouwalk.global;

import uk.co.birchlabs.touhouwalk.R;

/**
 * Created by birch on 06/01/2017.
 */

public class Variables {
    public static final String sprite_scale = "sprite_scale";
    public static final String spawn_checkbox_top = "spawn_checkbox_top";
    public static final String spawn_checkbox_bottom = "spawn_checkbox_bottom";

    public static String getSpawnCheckboxVar(int id) {
        if (id == R.id.spawn_checkbox_top) {
            return spawn_checkbox_top;
        } else if (id == R.id.spawn_checkbox_bottom) {
            return spawn_checkbox_bottom;
        }
        throw new IllegalArgumentException();
    }
}
