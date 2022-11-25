package com.example.practica7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lista;
    String[][] datos = {
            {"titulo 1", "director 1", "1:30", "10", "descripcion 1"},
            {"titulo 2", "director 2", "1:30", "10", "descripcion 2"},
            {"titulo 3", "director 3", "1:30", "10", "descripcion 3"},
            {"titulo 4", "director 4", "1:30", "10", "descripcion 4"},
            {"titulo 5", "director 5", "1:30", "10", "descripcion 5"}
    };

    int[] imagenes = {
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = findViewById(R.id.lv_lista);
        lista.setAdapter(new Adaptador(getApplicationContext(), datos, imagenes));
    }
}