package com.example.pcparts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    ImageButton IB1;
    ImageButton IB2;
    ImageButton IB3;
    ImageButton IB4;
    ImageButton IB5;
    ImageButton IB6;
    ImageButton IB7;
    ImageButton IB8;
    ImageButton IB9;
    ImageButton IB10;
    ImageButton IB11;
    ImageButton IB12;
    ImageButton IB13;
    ImageButton IB14;
    ImageButton IB15;
    ImageButton IB16;
    ImageButton IB17;
    ImageButton IB18;
    ImageButton IB19;
    ImageButton IB20;
    ImageButton IB21;
    ImageButton IB22;
    ImageButton IB23;
    ImageButton IB24;


    TextView TV1;
    TextView TV2;
    TextView TV3;
    TextView TV4;
    TextView TV5;
    TextView TV6;
    TextView TV7;
    TextView TV8;
    TextView TV9;
    TextView TV10;
    TextView TV11;
    TextView TV12;
    TextView TV13;
    TextView TV14;
    TextView TV15;
    TextView TV16;
    TextView TV17;
    TextView TV18;
    TextView TV19;
    TextView TV20;
    TextView TV21;
    TextView TV22;
    TextView TV23;
    TextView TV24;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IB1 = findViewById(R.id.IB1);
        IB2 = findViewById(R.id.IB2);
        IB3 = findViewById(R.id.IB3);
        IB4 = findViewById(R.id.IB4);
        IB5 = findViewById(R.id.IB5);
        IB6 = findViewById(R.id.IB6);
        IB7 = findViewById(R.id.IB7);
        IB8 = findViewById(R.id.IB8);
        IB9 = findViewById(R.id.IB9);
        IB10 = findViewById(R.id.IB10);
        IB11 = findViewById(R.id.IB11);
        IB12 = findViewById(R.id.IB12);
        IB13 = findViewById(R.id.IB13);
        IB14 = findViewById(R.id.IB14);
        IB15 = findViewById(R.id.IB15);
        IB16 = findViewById(R.id.IB16);
        IB17 = findViewById(R.id.IB17);
        IB18 = findViewById(R.id.IB18);
        IB19 = findViewById(R.id.IB19);
        IB20 = findViewById(R.id.IB20);
        IB21 = findViewById(R.id.IB21);
        IB22 = findViewById(R.id.IB22);
        IB23 = findViewById(R.id.IB23);
        IB24 = findViewById(R.id.IB24);

        TV1 = findViewById(R.id.TV1);
        TV2 = findViewById(R.id.TV2);
        TV3 = findViewById(R.id.TV3);
        TV4 = findViewById(R.id.TV4);
        TV5 = findViewById(R.id.TV5);
        TV6 = findViewById(R.id.TV6);
        TV7 = findViewById(R.id.TV7);
        TV8 = findViewById(R.id.TV8);
        TV9 = findViewById(R.id.TV9);
        TV10 = findViewById(R.id.TV10);
        TV11 = findViewById(R.id.TV11);
        TV12 = findViewById(R.id.TV12);
        TV13 = findViewById(R.id.TV13);
        TV14 = findViewById(R.id.TV14);
        TV15 = findViewById(R.id.TV15);
        TV16 = findViewById(R.id.TV16);
        TV17 = findViewById(R.id.TV17);
        TV18 = findViewById(R.id.TV18);
        TV19 = findViewById(R.id.TV19);
        TV20 = findViewById(R.id.TV20);
        TV21 = findViewById(R.id.TV21);
        TV22 = findViewById(R.id.TV22);
        TV23 = findViewById(R.id.TV23);
        TV24 = findViewById(R.id.TV24);


        IB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("buttonIndex", 1);
                startActivity(intent);
            }
        });//
        IB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("buttonIndex", 2);
                startActivity(intent);
            }
        });//
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);





    }
}