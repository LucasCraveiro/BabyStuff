package com.example.lucascraveiro.babystuff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView ivWhite, ivAnimal, ivLogo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ivWhite = (ImageView) findViewById(R.id.btn1);
        ivAnimal = (ImageView) findViewById(R.id.btn2);
        ivLogo = (ImageView) findViewById(R.id.logo);



    }

    public void AnimalSound(View view) {
    }

    public void WhiteNoise(View view) {
    }
}
