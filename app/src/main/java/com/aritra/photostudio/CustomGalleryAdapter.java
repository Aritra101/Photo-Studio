package com.aritra.photostudio;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

//In this step we create an adapter in which we extend base adapter and it implements four methods
//Base Adapter here it is an inbuilt class in Android which works as a refining of the raw data it can be text,img,anything
//Base Adapter can be extended to create a custom adapter
public class CustomGalleryAdapter extends BaseAdapter {
    private Context cont;
    private int images[];

    public CustomGalleryAdapter(Context cont, int[] images) {
        this.cont = cont;
        this.images = images;
    }
    //It returns the length of array
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    //Returns an imageview view
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imgV1= new ImageView(cont);//Creates imageview automatically
        imgV1.setImageResource(images[i]);//For all items of gallery similar to list view in android
        imgV1.setLayoutParams(new Gallery.LayoutParams(200,200));//set the parameter of your selected layout
        return imgV1;
    }
}
