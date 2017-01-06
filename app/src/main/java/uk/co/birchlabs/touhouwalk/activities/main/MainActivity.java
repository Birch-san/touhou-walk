package uk.co.birchlabs.touhouwalk.activities.main;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import uk.co.birchlabs.touhouwalk.R;
import uk.co.birchlabs.touhouwalk.services.walker.WalkerService;

public class MainActivity extends AppCompatActivity {

    // code to post/handler request for permission
//    public final static int REQUEST_CODE = -1010101;
    public final static int REQUEST_CODE = 5463 & 0xffffff00;

    public void checkDrawOverlayPermission(Context context) {
        // check if we already  have permission to draw over other apps
        if (Settings.canDrawOverlays(context)) {
            startServiceIfPossible();
        } else {
            // if not construct intent to request permission
            final Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                    Uri.parse("package:" + getPackageName()));
            // request permission via start activity for result
            startActivityForResult(intent, REQUEST_CODE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // check if received result code
        // is equal our requested code for draw permission
        if (requestCode == REQUEST_CODE) {
            // if so check once again if we have permission
            startServiceIfPossible();
        }
    }

    private void startServiceIfPossible() {
        if (isMyServiceRunning(WalkerService.class)) {
            return;
        }
        if (Settings.canDrawOverlays(this)) {
            // continue here - permission was granted
            startService();
        }
    }

    private Intent getServiceIntent() {
        return new Intent(getApplicationContext(), WalkerService.class);
    }

    private void startService() {
        startService(getServiceIntent());
        ((android.widget.Button)findViewById(R.id.start_button)).setText(R.string.restart);
    }

    private boolean isMyServiceRunning(Class<?> serviceClass) {
        ActivityManager manager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        for (ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {
            if (serviceClass.getName().equals(service.service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    private void stopServiceIfPossible() {
        if (isMyServiceRunning(WalkerService.class)) {
            onDestroyService(stopService(getServiceIntent()));
        }
    }

    private void onDestroyService(boolean success) {
        if (!success) {
            return;
        }
        ((android.widget.Button)findViewById(R.id.start_button)).setText(R.string.start);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        stopServiceIfPossible();

        (findViewById(R.id.start_button)
        ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkDrawOverlayPermission(getApplicationContext());
            }
        });
        (findViewById(R.id.stop_button)
        ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopServiceIfPossible();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        stopServiceIfPossible();
    }
}
