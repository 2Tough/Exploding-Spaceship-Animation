package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView explosion;
    AnimationDrawable animate;
    ImageView rocket;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rocket = findViewById(R.id.rocket);

        Animation shake = AnimationUtils.loadAnimation(this, R.anim.shake);
        rocket.startAnimation(shake);


        rocket.setBackgroundResource(R.drawable.explosionanimation);
        animate = (AnimationDrawable) rocket.getBackground();
        animate.start();
    }
}