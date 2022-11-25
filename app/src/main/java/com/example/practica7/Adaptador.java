package com.example.practica7;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {

    private static LayoutInflater layoutInflater;
    private Context context;
    private String[][] datos;
    private int[] imagenes;

    public Adaptador(Context context, String[][] datos, int[] imagenes) {
        this.context = context;
        this.datos = datos;
        this.imagenes = imagenes;
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final View v = layoutInflater.inflate(R.layout.lista_peliculas, null);
        TextView titulo = v.findViewById(R.id.tv_titulo);
        TextView director = v.findViewById(R.id.tv_director);
        TextView duracion = v.findViewById(R.id.tv_duracion);
        RatingBar calificacion = v.findViewById(R.id.rb_calificacion);
        ImageView imagen = v.findViewById(R.id.iv_imagen);

        titulo.setText(datos[i][0]);
        director.setText(datos[i][1]);
        duracion.setText("Duración: " + datos[i][2]);
        calificacion.setProgress(Integer.parseInt(datos[i][3]));
        imagen.setImageResource(imagenes[i]);
        //imagen.setTag(i);
        imagen.setOnClickListener(listener -> {
            Intent intent = new Intent(context, VisorImagen.class);
            intent.putExtra("img", imagenes[i]);
            context.startActivity(intent);
        });

        return v;
    }

    @Override
    public int getCount() {
        return datos.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
}
