package uk.co.birchlabs.touhouwalk.services.walker;

import java.util.List;

/**
 * Created by birch on 01/01/2017.
 */

public class ViewLifeCycleCallbackDelegator implements ViewEventHandler {
    private final List<ViewEventHandler> callbacks;

    public ViewLifeCycleCallbackDelegator(List<ViewEventHandler> callbacks) {
        this.callbacks = callbacks;
    }

    @Override
    public void onReady() {
        for (ViewEventHandler callback : callbacks) {
            callback.onReady();
        }
    }

    @Override
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        for (ViewEventHandler callback : callbacks) {
            callback.onSizeChanged(w, h, oldw, oldh);
        }
    }
}
