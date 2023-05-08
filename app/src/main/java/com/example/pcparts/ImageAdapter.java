package com.example.pcparts;
import android.widget.BaseAdapter;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;

import android.widget.ImageButton;
import android.widget.Button;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private int[] mImageIds;

    public ImageAdapter(Context context, int[] imageIds) {
        mContext = context;
        mImageIds = imageIds;
    }

    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageButton IB1;
        if (convertView == null) {
            IB1 = new ImageButton(mContext);
            IB1.setLayoutParams(new GridView.LayoutParams(350, 350));
            IB1.setScaleType(ImageView.ScaleType.CENTER_CROP);
            IB1.setPadding(8, 8, 8, 8);
        } else {
            IB1 = (ImageButton) convertView;
        }

        IB1.setImageResource(mImageIds[position]);
        IB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the button click event here
            }
        });

        return IB1;
    }
}
