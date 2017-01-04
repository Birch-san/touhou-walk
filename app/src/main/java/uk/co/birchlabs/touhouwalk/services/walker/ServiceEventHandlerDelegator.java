package uk.co.birchlabs.touhouwalk.services.walker;

import android.content.res.Configuration;

import java.util.List;

/**
 * Created by birch on 01/01/2017.
 */

public class ServiceEventHandlerDelegator implements ServiceEventHandler {

    private final List<ServiceEventHandler> serviceEventHandlers;

    public ServiceEventHandlerDelegator(List<ServiceEventHandler> serviceEventHandlers) {
        this.serviceEventHandlers = serviceEventHandlers;
    }

    @Override
    public void onDestroyed() {
        for (ServiceEventHandler serviceEventHandler : serviceEventHandlers) {
            serviceEventHandler.onDestroyed();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        for (ServiceEventHandler serviceEventHandler : serviceEventHandlers) {
            serviceEventHandler.onConfigurationChanged(newConfig);
        }
    }
}
