package birchlabs.co.uk.touhouwalk.views;

import android.content.Context;
import android.view.View;

/**
 * Created by birch on 08/10/2016.
 */

public class WalkerView extends View {
    public WalkerView(Context c) {
        super(c);
        updateDisplay();
    }

    private void updateDisplay() {
        requestLayout();
        // or
        // invalidate();
    }
}
