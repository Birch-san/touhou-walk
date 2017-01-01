package uk.co.birchlabs.touhouwalk.services.walker;

import java.util.List;

/**
 * Created by birch on 01/01/2017.
 */

public class ViewLifeCycleCallbackDelegator implements ViewLifecycleCallback {
    private final List<ViewLifecycleCallback> callbacks;

    public ViewLifeCycleCallbackDelegator(List<ViewLifecycleCallback> callbacks) {
        this.callbacks = callbacks;
    }

    @Override
    public void onReady() {
        for (ViewLifecycleCallback callback : callbacks) {
            callback.onReady();
        }
    }
}
