package com.example.pcparts;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondActivity extends AppCompatActivity {


    private List<Integer> getImageListForButton(int buttonIndex) {
        List<Integer> imageList;

        // Determine the appropriate imageList based on the buttonIndex
        switch (buttonIndex) {
            case 1:
                imageList = Arrays.asList(R.drawable.image1, R.drawable.image2);
                break;
//            case 2:
//                imageList = Arrays.asList(R.drawable.image4, R.drawable.image5, R.drawable.image6);
//                break;
            // Add more cases as needed
            default:
                imageList = Collections.emptyList();
                break;
        }

        return imageList;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("buttonIndex")) {
            int buttonIndex = extras.getInt("buttonIndex");

            ViewPager2 viewPager2 = findViewById(R.id.VP0);
            List<Integer> imageList = getImageListForButton(buttonIndex);
            ImagePagerAdapter imagePagerAdapter = new ImagePagerAdapter(imageList);
            viewPager2.setAdapter(imagePagerAdapter);//
        }
    }
}