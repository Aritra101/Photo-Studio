package com.aritra.photostudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public ImageView imgView;
    public Gallery gallery;
    CustomGalleryAdapter custom;
    //This is the image array
    public int images[]={
            R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,
            R.drawable.img5,R.drawable.img6,R.drawable.img7,R.drawable.img8,
            R.drawable.img9,R.drawable.img10,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgView=findViewById(R.id.imgV);
        gallery=findViewById(R.id.galleryV);
        //Initialize the addpter with 2 params which is context of your activity and the object of your array where all the images are stored
        custom= new CustomGalleryAdapter(getApplicationContext(),images);
        //Bind the adapter with galleryView
        gallery.setAdapter(custom);
        //It is a method of gallery view by using this we can seperate our content with size
        gallery.setSpacing(10);
        //OnItemClickListener works here as a ow user click on a particular item from an adapter
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            //set the selected Image in the imageview
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                imgView.setImageResource(images[i]);
            }
        });
    }
}