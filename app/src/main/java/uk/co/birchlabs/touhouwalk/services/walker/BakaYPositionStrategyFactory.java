package uk.co.birchlabs.touhouwalk.services.walker;

import java.util.EnumMap;
import java.util.Map;

/**
 * Created by birch on 05/01/2017.
 */

public class BakaYPositionStrategyFactory {
    private static final Map<AxisOrientation, BakaYPositionStrategy> strategyMap;

    static {
        strategyMap = new EnumMap<>(AxisOrientation.class);
        strategyMap.put(AxisOrientation.Standard, new BakaYPositionStandardStrategy());
        strategyMap.put(AxisOrientation.Inverted, new BakaYPositionInvertedStrategy());
    }

    public static BakaYPositionStrategy getStrategy(AxisOrientation yAxisOrientation) {
        if (!strategyMap.containsKey(yAxisOrientation)) {
            throw new IllegalArgumentException();
        }
        return strategyMap.get(yAxisOrientation);
    }
}
