package uk.co.birchlabs.touhouwalk.services.walker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import uk.co.birchlabs.touhouwalk.R;

/**
 * Created by birch on 08/10/2016.
 */

public class WalkerView extends SurfaceView {
    private Paint systemPaint;
    private SurfaceHolder holder;
//    private DisplayMetrics metrics;
//    private WindowManager wm;

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
//        metrics = new DisplayMetrics();
//        wm = (WindowManager) c.getSystemService(Context.WINDOW_SERVICE);
//        wm.getDefaultDisplay().getMetrics(metrics);

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
//        final BitmapFactory.Options dimensions = new BitmapFactory.Options();
//        dimensions.inJustDecodeBounds = true;
//        final Bitmap sham = BitmapFactory.decodeResource(getResources(), R.drawable.reimu, dimensions);

        bmp = getScaledBmp(R.drawable.reimu);


        systemPaint = new Paint();
//        systemPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
//        systemPaint.setColor(Color.TRANSPARENT);
//        systemPaint.setAlpha(75);

//        updateDisplay();

    }

    private Bitmap getScaledBmp(int id) {
        return resizeBitmap(
                getRawBmp(
                        id
                ),
                2
        );
    }

    private Bitmap getRawBmp(int id) {
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        return BitmapFactory.decodeResource(
                getResources(),
                id,
                options
        );
    }

    private Bitmap resizeBitmap(Bitmap bitmap, int multiplier) {
        return Bitmap.createScaledBitmap(
                bitmap,
                bitmap.getWidth()*multiplier,
                bitmap.getHeight()*multiplier,
                false
        );
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
        canvas.drawBitmap(bmp, 0, 0, systemPaint);
    }
}
