package uk.co.birchlabs.touhouwalk.services.walker;

import android.content.res.Configuration;

/**
 * Created by birch on 01/01/2017.
 */

public interface ServiceEventHandler {
    void onDestroyed();
    void onConfigurationChanged(Configuration newConfig);
}
