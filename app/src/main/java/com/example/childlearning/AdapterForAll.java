package com.example.childlearning;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class AdapterForAll extends BaseAdapter {

    Context c;
    int images[];

    AdapterForAll(Context c, int images[]) {
        this.c = c;
        this.images = images;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null) {
            LayoutInflater inf = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inf.inflate(R.layout.image_template, null);
        }

        ImageView imageView = view.findViewById(R.id.imageViewTemplate);
        imageView.setImageResource(images[i]);
        return view;
    }
}
