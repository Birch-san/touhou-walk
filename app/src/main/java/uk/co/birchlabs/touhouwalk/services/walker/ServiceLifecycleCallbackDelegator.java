package uk.co.birchlabs.touhouwalk.services.walker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by birch on 01/01/2017.
 */

public class ServiceLifecycleCallbackDelegator implements ServiceLifecycleCallback {

    private final List<ServiceLifecycleCallback> serviceLifecycleCallbacks;

    public ServiceLifecycleCallbackDelegator(List<ServiceLifecycleCallback> serviceLifecycleCallbacks) {
        this.serviceLifecycleCallbacks = serviceLifecycleCallbacks;
    }

    @Override
    public void onDestroyed() {
        for (ServiceLifecycleCallback serviceLifecycleCallback : serviceLifecycleCallbacks) {
            serviceLifecycleCallback.onDestroyed();
        }
    }
}
