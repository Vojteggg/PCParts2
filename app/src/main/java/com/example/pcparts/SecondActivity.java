package com.example.pcparts;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.Arrays;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 viewPager2 = findViewById(R.id.ViewPager2);
        List<Integer> imageList = Arrays.asList(R.drawable.image1, R.drawable.image2, R.drawable.image3);
        ImagePagerAdapter imagePagerAdapter = new ImagePagerAdapter(imageList);
        viewPager2.setAdapter(imagePagerAdapter);
    }
}