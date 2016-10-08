package birchlabs.co.uk.touhouwalk.services;

import android.app.Service;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.WindowManager;

import birchlabs.co.uk.touhouwalk.views.WalkerView;

/**
 * Created by birch on 08/10/2016.
 */

public class Walker extends Service {
    private View view;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {

        System.out.println("Walker service created");

        super.onCreate();
        view = new WalkerView(this);
        WindowManager.LayoutParams params = new WindowManager.LayoutParams(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.TYPE_SYSTEM_ALERT,
                WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN,
                PixelFormat.TRANSLUCENT
        );
        params.setTitle("Touhou");
        WindowManager wm = (WindowManager)getSystemService(WINDOW_SERVICE);
        wm.addView(view, params);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        ((WindowManager)getSystemService(WINDOW_SERVICE)).removeView(view);
        view = null;
    }
}
