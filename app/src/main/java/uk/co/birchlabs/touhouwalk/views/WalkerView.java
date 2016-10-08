package uk.co.birchlabs.touhouwalk.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;

import uk.co.birchlabs.touhouwalk.R;

/**
 * Created by birch on 08/10/2016.
 */

public class WalkerView extends SurfaceView {
    private Paint systemPaint;
    private SurfaceHolder holder;

    private Bitmap bmp;

    public WalkerView(Context c, AttributeSet attributeSet) {
        super(c, attributeSet);
        init(c);
    }

    public WalkerView(Context c) {
        super(c);
        init(c);
    }

    private void init(Context c) {

        setZOrderOnTop(true);
        holder = getHolder();
        holder.setFormat(PixelFormat.TRANSPARENT);

        holder.addCallback(new SurfaceHolder.Callback() {

            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {
            }

            @Override
            public void surfaceCreated(SurfaceHolder holder) {
                Canvas c = holder.lockCanvas(null);
                onDraw(c);
                holder.unlockCanvasAndPost(c);
            }

            @Override
            public void surfaceChanged(
                    SurfaceHolder holder,
                    int format,
                    int width,
                    int height
            ) {

            }
        });
        bmp = BitmapFactory.decodeResource(getResources(), R.drawable.reimu);


        systemPaint = new Paint();
//        systemPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
//        systemPaint.setColor(Color.TRANSPARENT);
//        systemPaint.setAlpha(75);

//        updateDisplay();

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

//        canvas.drawRect(
//                0,
//                0,
//                getWidth(),
//                getHeight(),
//                systemPaint
//        );
//        canvas.drawColor(Color.BLACK);
        canvas.drawBitmap(bmp, 10, 10, systemPaint);
    }
}
