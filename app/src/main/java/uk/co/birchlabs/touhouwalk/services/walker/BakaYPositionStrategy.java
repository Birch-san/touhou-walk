package uk.co.birchlabs.touhouwalk.services.walker;

/**
 * Created by birch on 05/01/2017.
 */

public interface BakaYPositionStrategy {
    int getYDest(int worldHeight, float y, int scaledHeight);
}
