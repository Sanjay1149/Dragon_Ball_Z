package com.example.android.dragonballz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sanjaypradeep on 10-08-2016.
 */
public class FullImageActivity extends Activity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_image);


        Intent i = getIntent();

        int position = i.getExtras().getInt("id");
        String[] name = i.getStringArrayExtra("name");

        textView = (TextView) findViewById(R.id.text);
        textView.setText(name[position]);

        ImageAdapter imageAdapter = new ImageAdapter(this);

        ImageView imageView = (ImageView) findViewById(R.id.full_image_view);

        imageView.setImageResource(imageAdapter.mThumbIds[position]);

    }
}
