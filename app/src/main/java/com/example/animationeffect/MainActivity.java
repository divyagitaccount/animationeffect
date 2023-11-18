package com.example.animationeffect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activit_xml);
        Button btn = findViewById(R.id.button2);
        btn.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, merrychristmas.class);
            startActivity(i);
        });
    }
}
