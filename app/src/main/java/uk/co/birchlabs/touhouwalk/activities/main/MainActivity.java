package uk.co.birchlabs.touhouwalk.activities.main;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.NumberPicker;
import android.widget.Toast;

import uk.co.birchlabs.touhouwalk.R;
import uk.co.birchlabs.touhouwalk.global.MikoDatabase;
import uk.co.birchlabs.touhouwalk.global.Variables;
import uk.co.birchlabs.touhouwalk.services.walker.WalkerService;

public class MainActivity extends AppCompatActivity {

    // code to post/handler request for permission
//    public final static int REQUEST_CODE = -1010101;
    public final static int REQUEST_CODE = 5463 & 0xffffff00;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // check if received result code
        // is equal our requested code for draw permission
        if (requestCode == REQUEST_CODE) {
            // if so check once again if we have permission
            if (Settings.canDrawOverlays(this)) {
                startService();
            } else {
                Toast.makeText(this, R.string.no_privilege, Toast.LENGTH_LONG).show();
            }
        }
    }

    private void attemptStartOrRestartServiceAsAppropriate() {
        if (isMyServiceRunning(WalkerService.class)) {
            restartService();
        } else {
            attemptStartService();
        }
    }

    private void restartService() {
        stopService();
        attemptStartService();
    }

    private void attemptStartService() {
        // check if we already have permission to draw over other apps
        if (Settings.canDrawOverlays(this)) {
            startService();
        } else {
            // if not construct intent to request permission
            final Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                    Uri.parse("package:" + getPackageName()));
            // request permission via start activity for result
            startActivityForResult(intent, REQUEST_CODE);
        }
    }

    private Intent getServiceIntent() {
        return new Intent(getApplicationContext(), WalkerService.class);
    }

    private void startService() {
        startService(getServiceIntent());
        configureFormGivenServiceRunning();
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

    private void stopServiceIfRunning() {
        if (isMyServiceRunning(WalkerService.class)) {
            stopService();
        }
    }

    private void stopService() {
        onDestroyService(stopService(getServiceIntent()));
    }

    private void onDestroyService(boolean success) {
        if (!success) {
            return;
        }
        configureFormGivenServiceNotRunning();
    }

    private void configureFormGivenServiceNotRunning() {
        ((android.widget.Button)findViewById(R.id.start_button)).setText(R.string.start);
        findViewById(R.id.stop_button).setEnabled(false);
    }

    private void configureFormGivenServiceRunning() {
        ((android.widget.Button)findViewById(R.id.start_button)).setText(R.string.restart);
        findViewById(R.id.stop_button).setEnabled(true);
    }

    private boolean atLeastOneSpawnRegionChecked() {
        return ((CheckBox) findViewById(R.id.spawn_checkbox_top)).isChecked()
                ||((CheckBox) findViewById(R.id.spawn_checkbox_bottom)).isChecked();
    }

    private void initForm() {
        final SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        final NumberPicker spriteScale = (NumberPicker) findViewById(R.id.sprite_scale);
        spriteScale.setMinValue(1);
        spriteScale.setMaxValue(8);
        spriteScale.setValue(prefs.getInt(Variables.sprite_scale, 2));
        spriteScale.setWrapSelectorWheel(false);

        spriteScale.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal){
                final SharedPreferences.Editor editor = prefs.edit();
                editor.putInt(Variables.sprite_scale, newVal);
                editor.apply();
            }
        });

        findViewById(R.id.start_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                attemptStartOrRestartServiceAsAppropriate();
            }
        });
        findViewById(R.id.stop_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopServiceIfRunning();
            }
        });

        final CheckBox spawnCheckboxTop = (CheckBox) findViewById(R.id.spawn_checkbox_top);
        final CheckBox spawnCheckboxBottom = (CheckBox) findViewById(R.id.spawn_checkbox_bottom);

        spawnCheckboxTop.setChecked(prefs.getBoolean(Variables.spawn_checkbox_top, true));
        spawnCheckboxBottom.setChecked(prefs.getBoolean(Variables.spawn_checkbox_bottom, true));

        final CompoundButton.OnCheckedChangeListener spawnButtonCheckedHandler = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (!atLeastOneSpawnRegionChecked()) {
                    Toast.makeText(MainActivity.this, R.string.spawn_checkbox_at_least, Toast.LENGTH_LONG).show();
                    compoundButton.setChecked(!compoundButton.isChecked());
                    return;
                }
                final SharedPreferences.Editor editor = prefs.edit();
                editor.putBoolean(Variables.getSpawnCheckboxVar(compoundButton.getId()), b);
                editor.apply();
            }
        };

        spawnCheckboxBottom.setOnCheckedChangeListener(spawnButtonCheckedHandler);
        spawnCheckboxTop.setOnCheckedChangeListener(spawnButtonCheckedHandler);

        final ListView listView = (ListView) findViewById(R.id.baka_list);

        final BakaArrayAdapter bakaArrayAdapter = new BakaArrayAdapter(
                listView.getContext(),
                MikoDatabase.getKeys()
        );

        findViewById(R.id.baka_clear_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final SharedPreferences.Editor editor = prefs.edit();
                for (String mikoKey : MikoDatabase.getKeys()) {
                    editor.putBoolean(Variables.getBakaCheckboxVar(mikoKey), false);
                }
                editor.apply();
                bakaArrayAdapter.notifyDataSetChanged();
            }
        });

        findViewById(R.id.baka_default_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final SharedPreferences.Editor editor = prefs.edit();
                for (String mikoKey : MikoDatabase.getKeys()) {
                    editor.putBoolean(Variables.getBakaCheckboxVar(mikoKey), MikoDatabase.isMikoOnByDefault(mikoKey));
                }
                editor.apply();
                bakaArrayAdapter.notifyDataSetChanged();
            }
        });

        listView.setAdapter(
                bakaArrayAdapter
        );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        setTitle(R.string.app_name);

        stopServiceIfRunning();

        initForm();
        configureFormGivenServiceNotRunning();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
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
        stopServiceIfRunning();
    }
}
