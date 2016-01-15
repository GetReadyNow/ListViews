package com.example.getreadynow.listviews;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class MyAdapter extends ArrayAdapter {

    public MyAdapter(Context context, String[] values) {
        super(context, R.layout.row_layout2, values);

    }

    //Override Getview which will create the rows for our list
    public View getView (int position, View convertView, ViewGroup Parent) {

        //Layout inflater puts a layout into the right view
        LayoutInflater myInflater = LayoutInflater.from(getContext());

        View myView = myInflater.inflate(R.layout.row_layout2, Parent, false);
        String tvShow = (String) getItem(position);

        TextView myTextView = (TextView) myView.findViewById(R.id.textView1);

        myTextView.setText(tvShow);

        ImageView myImageView = (ImageView) myView.findViewById(R.id.imageView1);

        myImageView.setImageResource(R.drawable.ic_check_box_outline_blank_black_24dp);

        return myView;

    }
}