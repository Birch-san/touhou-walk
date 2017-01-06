package uk.co.birchlabs.touhouwalk.activities.main;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import uk.co.birchlabs.touhouwalk.R;
import uk.co.birchlabs.touhouwalk.global.BitmapUtils;
import uk.co.birchlabs.touhouwalk.global.MikoDatabase;
import uk.co.birchlabs.touhouwalk.services.walker.Animation;
import uk.co.birchlabs.touhouwalk.services.walker.AnimationExtractor;
import uk.co.birchlabs.touhouwalk.services.walker.Spritesheet;

/**
 * Created by birch on 06/01/2017.
 */

public class BakaArrayAdapter extends ArrayAdapter<Integer> {
    private final Context context;
    private final Integer[] values;

    public BakaArrayAdapter(Context context, Integer[] values) {
        super(context, R.layout.baka_list_item_main, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        final View rowView = inflater.inflate(R.layout.baka_list_item_main, parent, false);
        final TextView textView = (TextView) rowView.findViewById(R.id.baka_list_text);
        final ImageView imageView = (ImageView) rowView.findViewById(R.id.baka_list_image);


        // Change icon based on name
        final Integer resource = values[position];

        final String localName;
        final String foreignName;

        final Locale currentLocale;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            currentLocale = getContext().getResources().getConfiguration().getLocales().get(0);
        } else {
            currentLocale = getContext().getResources().getConfiguration().locale;
        }

        final Set<Locale> jpLocales = new HashSet<>();
        jpLocales.add(Locale.JAPAN);
        jpLocales.add(Locale.JAPANESE);

        if (jpLocales.contains(currentLocale)) {
            localName = MikoDatabase.getMiko(resource).getJpName();
            foreignName = MikoDatabase.getMiko(resource).getEngName();
        } else {
            localName = MikoDatabase.getMiko(resource).getEngName();
            foreignName = MikoDatabase.getMiko(resource).getJpName();
        }

        textView.setText(
                String.format(
                        "%s (%s)",
                        localName,
                        foreignName
                )
        );

        final int scaleFactor = 1;

        final Spritesheet spritesheet = new Spritesheet(
                BitmapUtils.getRawBmp(
                        resource,
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

        return rowView;
    }
}
