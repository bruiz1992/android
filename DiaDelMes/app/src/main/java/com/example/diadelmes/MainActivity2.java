package com.example.diadelmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    private TextView respuesta;
    private Comprobar Aux = new Comprobar();
    private MediaPlayer mp;
    private MediaPlayer mp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        respuesta = (TextView)findViewById(R.id.textView2);
        String dato = getIntent().getStringExtra("dato");
        int numero = Integer.parseInt(dato);
        if(Aux.revision(numero) == true);

        {
            respuesta.setText("El numero de dia es correcto, Felicidades");
            mp = MediaPlayer.create(this,R.raw.bien);
            mp.start();
        }
         if (Aux.revision(numero) == false){
            respuesta.setTextColor(Color.RED);
            respuesta.setText("El numero de dia es incorrecto, Vuelva a intentarlo");
            mp2 = MediaPlayer.create(this,R.raw.error);
            mp.stop();
            mp2.start();
        }

    }

    public void Anterior(View view){
        Intent Anterior = new Intent(this,MainActivity.class);
        startActivity(Anterior);

    }

}