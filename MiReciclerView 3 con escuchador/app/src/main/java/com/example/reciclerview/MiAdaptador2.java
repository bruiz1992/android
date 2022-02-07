package com.example.reciclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MiAdaptador2 extends RecyclerView.Adapter<MiAdaptador2.MiViewHolder>
{

    private LayoutInflater inflador;
    private List<String> lista;
    private View.OnClickListener onClickListener;

    public MiAdaptador2 (Context context, List<String> lista)
    {
        this.lista = lista;
        inflador = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public MiViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = inflador.inflate(R.layout.elemento_layout, parent, false);
        v.setOnClickListener(onClickListener);
        return new MiViewHolder(v);
    }


    @Override
    public void onBindViewHolder(MiViewHolder holder, int i)
    {
        holder.titulo.setText(lista.get(i)); // Ponemos el título
        holder.subtitulo.setText("Subtitulo " + i);
        switch (Math.round((float) Math.random()*5)){
            case 0: holder.icon.setImageResource(R.drawable.imagen1); break;
            case 1: holder.icon.setImageResource(R.drawable.imagen2); break;
            case 2: holder.icon.setImageResource(R.drawable.imagen3); break;
            case 3: holder.icon.setImageResource(R.drawable.imagen4); break;
            default: holder.icon.setImageResource(R.drawable.imagen5); break;
        }
    }



    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class MiViewHolder extends RecyclerView.ViewHolder
    {

        public TextView titulo, subtitulo;
        public ImageView icon;

        public MiViewHolder(@NonNull View v)
        {
            super(v);
            titulo = (TextView) v.findViewById(R.id.titulo);
            subtitulo = (TextView) v.findViewById(R.id.subtitulo);
            icon = (ImageView) v.findViewById(R.id.icono);
        }

    }

    public void setOnClickListener(View.OnClickListener onClickListener)
    {
        this.onClickListener = onClickListener;
    }

}