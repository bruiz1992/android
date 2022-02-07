package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ComponentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterViewAnimator;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private GridView gridView;
    private AdaptadorDeCoches adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.grid);
        adaptador = new AdaptadorDeCoches(this);
        gridView.setAdapter(adaptador);
        gridView.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Coche coche = (Coche) parent.getItemAtPosition(position);
        Intent intent = new Intent(this,ActividadDetalle.class);
        intent.putExtra("IDcoche", coche.getId());
        Log.e("onItemClick","errooooooooooor");
        startActivity(intent);
    }


}