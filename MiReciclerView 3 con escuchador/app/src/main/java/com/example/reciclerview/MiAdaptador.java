package com.example.reciclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.MyViewHolder> {

    private String[] mDataSet;

    public MiAdaptador(String[] mDataSet) {
        this.mDataSet = mDataSet;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String data = mDataSet[position];
        holder.bindData(data);
    }

    @Override
    public int getItemCount() {
        return (mDataSet != null) ? mDataSet.length : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView text1;

        public MyViewHolder(@NonNull View v) {
            super(v);
            text1 = (TextView) v.findViewById(android.R.id.text1);
        }

        public void bindData(final String data) {
            text1.setText(data);
        }
    }
}