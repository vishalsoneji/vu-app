package com.example.childlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MyGridView extends AppCompatActivity implements AdapterView.OnItemClickListener {

    int[] images = {R.drawable.alpha1,R.drawable.alpha2,R.drawable.alpha3,R.drawable.alpha4,R.drawable.alpha5,R.drawable.alpha6,R.drawable.alpha7,R.drawable.alpha8,R.drawable.alpha9,R.drawable.alpha10,R.drawable.alpha11,R.drawable.alpha12,R.drawable.alpha13,R.drawable.alpha14,R.drawable.alpha15,R.drawable.alpha16,R.drawable.alpha17,R.drawable.alpha18,R.drawable.alpha19,R.drawable.alpha20,R.drawable.alpha21,R.drawable.alpha22,R.drawable.alpha23,R.drawable.alpha24,R.drawable.alpha25,R.drawable.alpha26,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_grid_view);

        GridView gridView = findViewById(R.id.myGridTemplate);

        AdapterForAll createAdapter = new AdapterForAll(this,images);
        gridView.setAdapter(createAdapter);
        gridView.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(this,PopUp.class);
        intent.putExtra("AnimationImages",images[i]);
        startActivity(intent);
    }
}