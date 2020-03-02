package com.samu.gridviewwithimageadapter;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("GridViewActivity");
        GridView gridview = (GridView) findViewById(R.id.grid_view1);
        gridview.setAdapter(new ImageAdapterActivity(this));



        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id){
                // Send intent to BA_GV_SingleViewActivity_1
                Intent i = new Intent(getApplicationContext(), SecondActivity.class);
                // Pass image index
                i.putExtra("id", position);
                startActivity(i);
            }
        });


    }


}
