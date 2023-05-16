package com.example.pcparts;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import java.util.List;

public class SecondActivity extends AppCompatActivity  {


    Button BT1;
    Button BT3;
    TextView TVnazwa;




    private DataCreate getImageListForButton(int buttonIndex) {
        List<Integer> imges=Arrays.asList();
        String name="";
        DataCreate data = new DataCreate(imges,name);

        // Determine the appropriate imageList based on the buttonIndex
        switch (buttonIndex) {
            case 1:
                data.imges = Arrays.asList(R.drawable.image1, R.drawable.image2);
                data.name = "Nazzwa1";
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
            ImagePagerAdapter imagePagerAdapter = new ImagePagerAdapter(imageList);
            viewPager2.setAdapter(imagePagerAdapter);//
        }
    }
}