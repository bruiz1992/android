package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ActividadDetalle extends AppCompatActivity {

    private Coche Itemdetallado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_detalle);
        int numero = getIntent().getIntExtra("IDcoche",0);
        itemDetallado = Coche.ge


    }

}