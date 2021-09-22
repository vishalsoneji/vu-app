package com.example.childlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_splash_screen);

        TextView t = findViewById(R.id.title);
        Typeface myFont = Typeface.createFromAsset(getAssets(),"fonts/BubbleShine.ttf");
        t.setTypeface(myFont);

        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent i = new Intent(SplashScreenActivity.this,MainActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        };thread.start();
    }
}