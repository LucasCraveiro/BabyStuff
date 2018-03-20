package com.example.lucascraveiro.babystuff;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;

public class WhiteNoiseGrid extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_white_noise_grid);

        GridLayout gridLayout = findViewById(R.id.grid_whitenoise);
        for (int i = 0; i < gridLayout.getChildCount(); i++) {
            ImageButton imgButt = (ImageButton) gridLayout.getChildAt(i);
            imgButt.setOnClickListener(this);
        }
    }

    public void Backpage(View view) {
    }

    @Override
    public void onClick(View view) {

        String imageTag = view.getTag().toString();

        Intent intent = new Intent(this, WhiteNoisePlayer.class);

        //3. put extra (image tag)
        intent.putExtra("title", imageTag);
        //4. start activity
        startActivity(intent);


    }
}
