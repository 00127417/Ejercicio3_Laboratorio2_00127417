package com.example.ejercicio3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout blue, green,red;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blue = findViewById(R.id.llBlue);
        green = findViewById(R.id.llGreen);
        red = findViewById(R.id.llRed);

        blue.setOnClickListener(this);
        green.setOnClickListener(this);
        red.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int idView = v.getId();

        int[] blues = {Color.rgb(0,0,75),Color.rgb(0,0,100),Color.rgb(0,0,125),
                Color.rgb(0,0,150),Color.rgb(0,0,175),Color.rgb(0,0,200)};
        int[] greens = {Color.rgb(0,75,0),Color.rgb(0,100,0),Color.rgb(0,125,0),
                Color.rgb(0,150,0),Color.rgb(0,175,0),Color.rgb(0,200,0)};
        int[] reds = {Color.rgb(75,0,0),Color.rgb(100,0,0),Color.rgb(125,0,0),
                Color.rgb(150,0,0),Color.rgb(175,0,0),Color.rgb(200,0,0)};
        switch (idView){
            case R.id.llBlue:
                blue.setBackgroundColor(blues[(int) Math.floor(Math.random()*6)]);
                break;
            case R.id.llGreen:
                green.setBackgroundColor(greens[(int) Math.floor(Math.random()*6)]);
                break;
            case R.id.llRed:
                red.setBackgroundColor(reds[(int) Math.floor(Math.random()*6)]);
                break;
        }
    }
}
