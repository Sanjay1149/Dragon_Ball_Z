package com.example.android.dragonballz;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by sanjaypradeep on 10-08-2016.
 */
public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    public Integer[] mThumbIds = {
            R.drawable.bardock,R.drawable.gohan,R.drawable.goku,R.drawable.goten,R.drawable.krillin,
            R.drawable.piccolo,R.drawable.radtiz,R.drawable.tien,R.drawable.trunks,R.drawable.vegeta
            ,R.drawable.yamcha
    };

    ImageAdapter(Context c){
        mContext = c;
    }

    @Override
    public Object getItem(int i) {
        return mThumbIds[i];
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[i]);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(305,305));

        return imageView;
    }
}

