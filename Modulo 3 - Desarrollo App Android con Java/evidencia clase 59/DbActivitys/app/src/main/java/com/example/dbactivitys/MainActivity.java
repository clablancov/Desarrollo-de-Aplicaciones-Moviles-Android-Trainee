package com.example.dbactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextBuscar(View v){
        Intent buscar = new Intent(this, Buscar.class);
        startActivity(buscar);
    }

    public void nextInsertar(View v){
        Intent insertar = new Intent(this, Insertar.class);
        startActivity(insertar);
    }

    public void nextModificar(View v){
        Intent modificar = new Intent(this, Modificar.class);
        startActivity(modificar);
    }

    public void nextEliminar(View v){
        Intent eliminar = new Intent(this, Eliminar.class);
        startActivity(eliminar);
    }

}