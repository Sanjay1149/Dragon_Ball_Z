package com.example.android.dragonballz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class Main extends AppCompatActivity {

    Intent i;

    String[] Characters = {
            "Bardock","Gohan","Goku","Goten","Krillin",
            "Piccolo","Radtiz","Tien","Trunks","Vegeta"
            ,"Yamcha"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goku_layout);

        GridView gridView = (GridView) findViewById(R.id.grid_view);

        // Instance of ImageAdapter Class
        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int in, long l) {
                Intent i = new Intent(getApplicationContext(),FullImageActivity.class);
                i.putExtra("id",in);
                i.putExtra("name",Characters);
                Toast.makeText(getBaseContext(),""+Characters[in]+"  is clicked",Toast.LENGTH_LONG).show();
                startActivity(i);
            }
        });
    }
}
