
package com.example.diadelmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText numero;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = (Button) findViewById(R.id.Boton1);
        numero = (EditText) findViewById(R.id.editTextNumber);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String verificar = numero.getText().toString();

                int dato = Integer.parseInt(verificar);
                if ( 1<= dato && dato >= 31) {
                    numero.setError("ningun mes tiene mas de 31 dias");
                } else {
                    Siguiente(view);
                }
            }
        });

    }

    public void Siguiente(View view) {
        Intent siguiente = new Intent(this, MainActivity2.class);
        siguiente.putExtra("dato", numero.getText().toString());
        startActivity(siguiente);

    }


}