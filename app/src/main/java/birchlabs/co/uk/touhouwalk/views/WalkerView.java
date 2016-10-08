package birchlabs.co.uk.touhouwalk.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;

/**
 * Created by birch on 08/10/2016.
 */

public class WalkerView extends View {
    private final Paint systemPaint;
    private final DisplayMetrics metrics;
    private final WindowManager wm;

    public WalkerView(Context c) {
        super(c);

        systemPaint = new Paint();

        metrics = new DisplayMetrics();

        wm = (WindowManager) c.getSystemService(Context.WINDOW_SERVICE);

        updateDisplay();
    }

    private void updateDisplay() {
        requestLayout();
        // or
        // invalidate();
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        wm.getDefaultDisplay().getMetrics(metrics);

        canvas.drawRect(
                0,
                0,
                getWidth(),
                getHeight(),
                systemPaint
        );
    }
}
