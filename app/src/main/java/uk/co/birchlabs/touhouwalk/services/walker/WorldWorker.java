package uk.co.birchlabs.touhouwalk.services.walker;

import android.content.res.Configuration;
import android.util.Log;

/**
 * Created by birch on 01/01/2017.
 */

public class WorldWorker extends Thread {
    private static final String logTag = WorldWorker.class.getName();

    private static final long FPS = 15;

    private final Gensoukyou gensoukyou;

    private boolean running;

    public WorldWorker(
            Gensoukyou gensoukyou
    ) {
        this.gensoukyou = gensoukyou;
    }

    public ViewEventHandler getViewEventHandler() {
        return new ViewEventHandler() {
            @Override
            public void onReady() {
                running = true;
                WorldWorker.this.start();
            }

            @Override
            public void onSizeChanged(int w, int h, int oldw, int oldh) {
            }
        };
    }

    public ServiceEventHandler getServiceEventHandler() {
        return new ServiceEventHandler() {
            @Override
            public void onDestroyed() {
                running = false;
                while (WorldWorker.this.isAlive()) {
                    try {
                        WorldWorker.this.join();
                        break;
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        Log.i(logTag, "Interrupted during join", e);
                    }
                }
            }

            @Override
            public void onConfigurationChanged(Configuration newConfig) {
            }
        };
    }

    @Override
    public void run() {
        final long ticksPS = 1000 / FPS;
        long startTime = System.currentTimeMillis();
        long prevStartTime;
        long sleepTime;
        long delta;
        while (running) {
            prevStartTime = startTime;
            startTime = System.currentTimeMillis();
            delta = startTime - prevStartTime;

            for(Baka baka: gensoukyou.getBakas()) {
                baka.tick(delta);
            }

            sleepTime = ticksPS - delta;
            try {
                sleep(Math.max(10, sleepTime));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                Log.i(logTag, "Interrupted during sleep", e);
            }
        }
    }
}
