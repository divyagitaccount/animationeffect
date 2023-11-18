package com.example.animationeffect;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.airbnb.lottie.LottieAnimationView;

public class merrychristmas extends AppCompatActivity {
  LottieAnimationView anime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merrychristmas);
        anime=findViewById(R.id.mc);
        anime.setVisibility(View.VISIBLE);
        anime.setOnClickListener(view -> Toast.makeText(this,"merry christmas",Toast.LENGTH_LONG).show());

    }
}