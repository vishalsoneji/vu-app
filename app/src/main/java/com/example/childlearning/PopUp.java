package com.example.childlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class PopUp extends AppCompatActivity {

    Bundle extra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up);

        extra = getIntent().getExtras();
        setAnimatedImage(extra.getInt("AnimationImages"));
    }

    public void setAnimatedImage(int imageName){
        ImageView imageView = findViewById(R.id.popImageID);
        imageView.setImageResource(imageName);
    }
}