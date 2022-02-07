package com.example.reciclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    //private MiAdaptador2 adaptador;
    private MiAdaptador adaptador;
    private MiAdaptador2 adaptador2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        // Ejemplo 1:
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todos_elementos_layout);

        //inicalizar el recyclerview:
        recyclerView = (RecyclerView) findViewById(R.id.recycle_view);

        //Definiendo datos
        final String[] datos = {"Álvaro", "Natalia", "Clara","Elena","Luis","Julián","José Luis","Fernando","Carolina","Antonio","Pilar",
                "Álvaro2", "Natalia2", "Clara2","Elena2","Luis2","Julián2","José Luis2","Fernando2","Carolina2","Antonio2","Pilar2",
                "Álvaro3", "Natalia3", "Clara3","Elena3","Luis3","Julián3","José Luis3","Fernando3","Carolina3","Antonio3","Pilar3"
        };


        //Crear adaptador:
        adaptador= new MiAdaptador(datos);
        // adaptador= new MiAdaptador2(this, datosLista);

        //Fijar el tamaño de los elementos
        recyclerView.setHasFixedSize(true);

        //Declarar la visualización de los elementos
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);


        //Asignar el adaptador al recyclerview
        recyclerView.setAdapter(adaptador);



/*
        // Ejemplo 2:
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todos_elementos_layout);

        //inicalizar el recyclerview:
        recyclerView = (RecyclerView) findViewById(R.id.recycle_view);

        //Definiendo datos
        final String[] datos = {"Álvaro", "Natalia", "Clara","Elena","Luis","Julián","José Luis","Fernando","Carolina","Antonio","Pilar",
                "Álvaro2", "Natalia2", "Clara2","Elena2","Luis2","Julián2","José Luis2","Fernando2","Carolina2","Antonio2","Pilar2",
                "Álvaro3", "Natalia3", "Clara3","Elena3","Luis3","Julián3","José Luis3","Fernando3","Carolina3","Antonio3","Pilar3"
        };

       final ArrayList datosLista = new ArrayList<String>();
       for (String s: datos) datosLista.add(s);


        //Crear adaptador:
        adaptador2= new MiAdaptador2(this, datosLista);

        //Fijar el tamaño de los elementos
        recyclerView.setHasFixedSize(true);

        //Declarar la visualización de los elementos
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        //Añadir un escuchador al adaptador:
        adaptador2.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v)
           {
               int pos = recyclerView.getChildAdapterPosition(v);
               String s= (String) datosLista.get(pos);
               Toast.makeText(MainActivity.this,"Posición: " + pos, Toast.LENGTH_SHORT).show();
           }
        });

        //Asignar el adaptador al recyclerview
        recyclerView.setAdapter(adaptador2);
*/
    }
}
