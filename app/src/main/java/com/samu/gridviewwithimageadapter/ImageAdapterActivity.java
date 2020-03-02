package com.samu.gridviewwithimageadapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapterActivity extends BaseAdapter {

    public Integer[] imageArry = { R.drawable.l1, R.drawable.l2,R.drawable.l3, R.drawable.l4,R.drawable.l5, R.drawable.l6 ,R.drawable.l7, R.drawable.l8 ,R.drawable.l1, R.drawable.l2,R.drawable.l3, R.drawable.l4,R.drawable.l5, R.drawable.l6 ,R.drawable.l7, R.drawable.l8 };

    private Context mContext;

    public ImageAdapterActivity(Context c) {
        mContext = c;
    }

    public int getCount() {
        return imageArry.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(250, 250));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
            imageView.setBaseline(10);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(imageArry[position]);
        return imageView;
    }


}
