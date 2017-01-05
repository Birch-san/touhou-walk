package uk.co.birchlabs.touhouwalk.services.walker;

/**
 * Created by birch on 05/01/2017.
 */

public class BakaYPositionInvertedStrategy implements BakaYPositionStrategy {
    @Override
    public int getYDest(
            int worldHeight,
            float y,
            int scaledHeight
    ) {
        return worldHeight - ((Math.round(y) + scaledHeight) % (worldHeight + scaledHeight));
    }
}
