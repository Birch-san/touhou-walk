package uk.co.birchlabs.touhouwalk.activities.main;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Locale;

import uk.co.birchlabs.touhouwalk.R;
import uk.co.birchlabs.touhouwalk.global.BitmapUtils;
import uk.co.birchlabs.touhouwalk.global.MikoDatabase;
import uk.co.birchlabs.touhouwalk.global.Variables;
import uk.co.birchlabs.touhouwalk.services.walker.Animation;
import uk.co.birchlabs.touhouwalk.services.walker.AnimationExtractor;
import uk.co.birchlabs.touhouwalk.services.walker.Spritesheet;

/**
 * Created by birch on 06/01/2017.
 */

public class BakaArrayAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;

    private final SharedPreferences prefs;
    private final Resources japaneseResources;

    public BakaArrayAdapter(Context context, String[] values) {
        super(context, R.layout.baka_list_item_main, values);
        this.context = context;
        this.values = values;
        prefs = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());

        final Configuration japaneseConfig = new Configuration(context.getResources().getConfiguration());
        japaneseConfig.setLocale(Locale.JAPANESE);

        final Context japaneseConfigContext = context.createConfigurationContext(japaneseConfig);
        japaneseResources = japaneseConfigContext.getResources();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        final View rowView = inflater.inflate(R.layout.baka_list_item_main, parent, false);
        final TextView textView = (TextView) rowView.findViewById(R.id.baka_list_text);
        final ImageView imageView = (ImageView) rowView.findViewById(R.id.baka_list_image);


        // Change icon based on name
        final String assetKey = values[position];

//        final String localName;
//        final String foreignName;
//
//        final Locale currentLocale;
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
//            currentLocale = getContext().getResources().getConfiguration().getLocales().get(0);
//        } else {
//            currentLocale = getContext().getResources().getConfiguration().locale;
//        }
//
//        final Set<Locale> jpLocales = new HashSet<>();
//        jpLocales.add(Locale.JAPAN);
//        jpLocales.add(Locale.JAPANESE);
        final int mikoNameIdentifier = context.getResources().getIdentifier(
                "miko_name_" + assetKey,
                "string",
                context.getApplicationContext().getPackageName()
        );

        final String localName = context.getResources().getString(mikoNameIdentifier);
        final String japaneseName = japaneseResources.getString(mikoNameIdentifier);

        if (japaneseName.isEmpty()) {
            textView.setText(
                    localName
            );
        } else {
            textView.setText(
                    String.format(
                            "%s\n%s",
                            localName,
                            japaneseName
                    )
            );
        }

        final int scaleFactor = 1;

        final Spritesheet spritesheet = new Spritesheet(
                BitmapUtils.getRawBmp(
                        MikoDatabase.getMiko(assetKey),
                        getContext().getResources()
                ),
                scaleFactor
                );

        final AnimationExtractor animationExtractor = new AnimationExtractor(spritesheet);

        final List<Animation> animations = animationExtractor.extract(4, 3);
        final Animation frontFacing = animations.get(0);
        final Rect idleFrame = frontFacing.getFrames().get(1);

        final Bitmap idleBitmap = Bitmap.createBitmap(
                spritesheet.getScaled(),
                idleFrame.left,
                idleFrame.top,
                idleFrame.width(),
                idleFrame.height()
        );

        imageView.setImageBitmap(idleBitmap);

        final CheckBox checkBox = (CheckBox) rowView.findViewById(R.id.baka_checkbox);

        checkBox.setChecked(prefs.getBoolean(Variables.getBakaCheckboxVar(assetKey), MikoDatabase.isMikoOnByDefault(assetKey)));

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                final SharedPreferences.Editor editor = prefs.edit();
                editor.putBoolean(Variables.getBakaCheckboxVar(assetKey), b);
                editor.apply();
            }
        });

        return rowView;
    }
}
