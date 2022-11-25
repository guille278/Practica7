package com.example.practica7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class VisorImagen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor_imagen);


        ImageView image = findViewById(R.id.iv_imagen);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null){
            image.setImageResource(bundle.getInt("img"));
        }
    }
}