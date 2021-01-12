package com.example.serviceapp2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class DataActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT1 = "com.example.serviceapp2.EXTRA_TEXT1";

    public static final String EXTRA_TEXT2 = "com.example.serviceapp2.EXTRA_TEXT2";
    private static final String TAG = "DataActivity";
    ImageView image;
    TextView name;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        Log.d(TAG, "onCreate: started.");

        Bundle extras = getIntent().getExtras();
        Intent intent = getIntent();
        image = findViewById(R.id.image);
         name = findViewById(R.id.image_description);
     //   String imageUrl = intent.getStringExtra("image_url");
        String imageName = intent.getStringExtra("image_name");
        String imageURL = intent.getStringExtra("image_url");


        setImage(imageURL, imageName);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBookingPage();
            }
        });

    }
//    private void getIncomingIntent(String imageUrl,String imageName){
//        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");
//      //  if(getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name")){
//            Log.d(TAG, "getIncomingIntent: found intent extras. ");
//
//            setImage(imageUrl, imageName);
//       // }
//    }
    private void setImage (String  imageUrl , String imageName){
        Log.d(TAG, "setImage: setting the image and name of the widgets. ");

       name.setText(imageName);


         Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);

    }
    public void openBookingPage(){
        EditText editText1 = (EditText) findViewById(R.id.edittext2);
        String text1 = editText1.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.edittext4);
        String text2 = editText2.getText().toString();


        Intent intent = new Intent(this, BookingActivity.class);
        intent.putExtra(EXTRA_TEXT1, text1);
        intent.putExtra(EXTRA_TEXT2, text2);
        startActivity(intent);

    }
}
