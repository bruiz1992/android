package com.example.diadelmes;

import androidx.annotation.Nullable;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Comprobar {


    public Comprobar() {
    }


    public boolean revision(int aux) {
        SimpleDateFormat dtf = new SimpleDateFormat("yyyy/MM/dd");
        Calendar calendar = Calendar.getInstance();
        Date dateObj = calendar.getTime();
        String formattedDate = dtf.format(dateObj);
        int num_dia = calendar.get(Calendar.DAY_OF_YEAR);// Aquí obtengo el dia del año
        String d = Integer.valueOf(num_dia).toString();
        boolean Salir = false;
        if(aux == num_dia){
            Salir = true;
        }
        return Salir;
    }
}
