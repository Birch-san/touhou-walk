package uk.co.birchlabs.touhouwalk.services.walker;

import android.graphics.Canvas;
import android.util.Log;

/**
 * Created by birch on 01/01/2017.
 */

public class WorldWorker extends Thread implements IdempotentStop {
    private static final String logTag = WorldWorker.class.getName();

    private static final long FPS = 1;

    private final Gensoukyou gensoukyou;

    private boolean running;

    public WorldWorker(
            Gensoukyou gensoukyou
    ) {
        this.gensoukyou = gensoukyou;
    }

    public ViewLifecycleCallback getViewLifecycleCallback() {
        return new ViewLifecycleCallback() {
            @Override
            public void onReady() {
                running = true;
                WorldWorker.this.start();
            }

            @Override
            public void onDestroyed() {
                idempotentStop();
            }
        };
    }

    @Override
    public synchronized void idempotentStop() {
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
    public void run() {
        final long ticksPS = 1000 / FPS;
        long startTime;
        long sleepTime;
        long delta;
        while (running) {
            Canvas c = null;
            startTime = System.currentTimeMillis();
            delta = System.currentTimeMillis() - startTime;
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
