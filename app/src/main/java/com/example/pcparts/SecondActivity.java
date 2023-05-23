package com.example.pcparts;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.List;

public class SecondActivity extends AppCompatActivity  {


    Button BT1;
    Button BT3;
    TextView TVnazwa;
    ImageView IMGV1;
    TextView PRICE;
    TextView T1;
    TextView T2;
    TextView T3;
    TextView T4;
    TextView T5;
    TextView T6;
    TextView T7;
    TextView T8;
    TextView T9;
    TextView T10;

    private DataCreate getImageListForButton(int buttonIndex) {
        List<Integer> imges=Arrays.asList();
        String name="";
        String price="";
        String webLink="";
        int table=0;


        // Determine the appropriate imageList based on the buttonIndex
        switch (buttonIndex) {
            case 1:
                imges = Arrays.asList(R.drawable.image1, R.drawable.image2);
                name = "Intel i9";
                table = R.drawable.image2;
                price = "1459 zł";
                webLink="https://www.x-kom.pl/p/533441-procesor-intel-core-i9-intel-core-i9-10980xe.html";
                break;

            case 2:
                imges = Arrays.asList(R.drawable.image1, R.drawable.image2);
                name = "Intel i9";
                table = R.drawable.image2;
                price = "1459 zł";
                webLink="https://www.x-kom.pl/p/533441-procesor-intel-core-i9-intel-core-i9-10980xe.html";
                break;


            // Add more cases as needed
            default:
                break;
        }

        return new DataCreate(imges,name,table,price,webLink);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        BT1= findViewById(R.id.BT1);
        BT3= findViewById(R.id.BT3);
        TVnazwa=findViewById(R.id.TVNazwa);
        IMGV1=findViewById(R.id.IMGV1);
        PRICE=findViewById(R.id.PIRCE);
        T1=findViewById(R.id.T1);
        T2=findViewById(R.id.T2);
        T3=findViewById(R.id.T3);
        T4=findViewById(R.id.T4);
        T5=findViewById(R.id.T5);
        T6=findViewById(R.id.T6);
        T7=findViewById(R.id.T7);
        T8=findViewById(R.id.T8);
        T9=findViewById(R.id.T9);
        T10=findViewById(R.id.T10);

        BT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("buttonIndex")) {
            int buttonIndex = extras.getInt("buttonIndex");
            DataCreate data = getImageListForButton(buttonIndex);
            ViewPager2 viewPager2 = findViewById(R.id.VP0);
            List<Integer> imageList = data.imges;
            TVnazwa.setText(data.name);
            IMGV1.setImageResource(data.table);
            PRICE.setText(data.price);
            ImagePagerAdapter imagePagerAdapter = new ImagePagerAdapter(imageList);
            viewPager2.setAdapter(imagePagerAdapter);

            BT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url =data.webLink;
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        }
    }
}