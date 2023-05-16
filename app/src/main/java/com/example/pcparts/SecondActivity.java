package com.example.pcparts;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.Arrays;
import java.util.Collections;

import java.util.List;

public class SecondActivity extends AppCompatActivity  {


    Button BT1;
    Button BT3;
    TextView TVnazwa;
    ImageView IMGV1;
    TextView PRICE;





    private DataCreate getImageListForButton(int buttonIndex) {
        List<Integer> imges=Arrays.asList();
        String name="";
        String price="";
        String webLink="";
        int table=0;

        DataCreate data = new DataCreate(imges,name,table,price,webLink);

        // Determine the appropriate imageList based on the buttonIndex
        switch (buttonIndex) {
            case 1:
                data.imges = Arrays.asList(R.drawable.image1, R.drawable.image2);
                data.name = "Intel i9";
                data.table = R.drawable.image2;
                data.price = "1459 zł";
                data.webLink="https://www.x-kom.pl/p/533441-procesor-intel-core-i9-intel-core-i9-10980xe.html";
                break;
//            case 2:
//                imageList = Arrays.asList(R.drawable.image4, R.drawable.image5, R.drawable.image6);
//                break;
            // Add more cases as needed
            default:
                data.imges = Collections.emptyList();
                data.name="";
                break;
        }

        return data;
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

            ViewPager2 viewPager2 = findViewById(R.id.VP0);
            List<Integer> imageList = getImageListForButton(buttonIndex).imges;
            TVnazwa.setText(getImageListForButton(buttonIndex).name);
            IMGV1.setImageResource(getImageListForButton(buttonIndex).table);
            PRICE.setText(getImageListForButton(buttonIndex).price);
            ImagePagerAdapter imagePagerAdapter = new ImagePagerAdapter(imageList);
            viewPager2.setAdapter(imagePagerAdapter);//
            BT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url =getImageListForButton(buttonIndex).webLink;
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        }
    }
}