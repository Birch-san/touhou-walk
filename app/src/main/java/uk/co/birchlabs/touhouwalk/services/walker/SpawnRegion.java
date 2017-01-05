package uk.co.birchlabs.touhouwalk.services.walker;

import java.util.EnumMap;
import java.util.Map;

/**
 * Created by birch on 02/01/2017.
 */

public enum SpawnRegion {
    Top,
    Bottom;

    private static final Map<SpawnRegion, AxisOrientation> yAxisMapping;

    static {
        yAxisMapping = new EnumMap<>(SpawnRegion.class);
        yAxisMapping.put(SpawnRegion.Top, AxisOrientation.Standard);
        yAxisMapping.put(SpawnRegion.Bottom, AxisOrientation.Inverted);
    }

    public static AxisOrientation toYAxisOrientation(SpawnRegion spawnRegion) {
        if (!yAxisMapping.containsKey(spawnRegion)) {
            throw new IllegalArgumentException();
        }
        return yAxisMapping.get(spawnRegion);
    }

    public AxisOrientation toYAxisOrientation() {
        return toYAxisOrientation(this);
    }
}
