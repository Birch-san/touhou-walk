package uk.co.birchlabs.touhouwalk.services.walker;

/**
 * Created by birch on 01/01/2017.
 */

public interface ViewEventHandler {
    void onReady();
    void onSizeChanged(int w, int h, int oldw, int oldh);
}
