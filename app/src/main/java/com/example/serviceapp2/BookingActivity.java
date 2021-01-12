package com.example.serviceapp2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BookingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        Intent intent = getIntent();
        String text1 = intent.getStringExtra(DataActivity.EXTRA_TEXT1);
        String text2 = intent.getStringExtra(DataActivity.EXTRA_TEXT2);

        TextView textView1 = (TextView) findViewById(R.id.textView5);
        TextView textView2 = (TextView) findViewById(R.id.textView7);
        textView1.setText(text1);
        textView2.setText(text2);
    }
}
