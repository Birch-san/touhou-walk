package uk.co.birchlabs.touhouwalk.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;

import uk.co.birchlabs.touhouwalk.R;

/**
 * Created by birch on 08/10/2016.
 */

public class WalkerView extends View {
    private Paint systemPaint;
    private DisplayMetrics metrics;
    private WindowManager wm;

    public WalkerView(Context c, AttributeSet attributeSet) {
        super(c, attributeSet);
        init(c);
    }

    public WalkerView(Context c) {
        super(c, null, R.style.Walker);
        init(c);
    }

    private void init(Context c) {

        systemPaint = new Paint();
        systemPaint.setAlpha(75);

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