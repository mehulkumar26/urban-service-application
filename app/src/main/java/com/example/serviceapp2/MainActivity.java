package com.example.serviceapp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }
    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");
        mImageUrls.add("https://as2.ftcdn.net/jpg/01/47/06/93/500_F_147069316_15U9jj1NHluVxYWMxageiXgsWFYGcASU.jpg");
        mNames.add("Electrician Service");

        mImageUrls.add("https://www.onlinelogomaker.com/blog/wp-content/uploads/2018/03/create-a-logo-1.jpg");
        mNames.add("Mechanic Service");

        mImageUrls.add("https://image.shutterstock.com/image-vector/cleaning-clean-service-logo-icon-600w-1007843164.jpg");
        mNames.add("Cleaning Service");

        mImageUrls.add("https://st2.depositphotos.com/1672707/11214/v/950/depositphotos_112149646-stock-illustration-plumber-logo-icon.jpg");
        mNames.add("Plumbing Services");

        mImageUrls.add("https://live.staticflickr.com/3927/33471787780_8861afec9e_b.jpg");
        mNames.add("Pest Control Service");

        mImageUrls.add("https://previews.123rf.com/images/alejik/alejik1602/alejik160200030/52727448-paint-roller-logo-icon-design-template-vector-paint-roll-logo-painting-of-walls-repair-of-apartments.jpg");
        mNames.add("Home Painter Service");

        mImageUrls.add("https://image.shutterstock.com/image-vector/yoga-logo-vector-emblem-600w-571076140.jpg");
        mNames.add("Yoga Trainers ");

        mImageUrls.add("https://ae01.alicdn.com/kf/HTB1GSCSlr3nBKNjSZFMq6yUSFXah/DCTAL-Man-Barber-Shop-Sticker-Estd-Name-Bread-Decal-Haircut-Shavers-Posters-Vinyl-Wall-Art-Decals.jpg");
        mNames.add("Men's Salon ");

        mImageUrls.add("https://s.tmimgcdn.com/scr/63800/beauty-house-logo-template_63893-big.jpg");
        mNames.add("Women's Salon ");

        initRecyclerView();
    }
    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
