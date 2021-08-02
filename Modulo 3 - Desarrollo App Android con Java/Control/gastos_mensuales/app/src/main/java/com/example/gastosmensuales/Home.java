package com.example.gastosmensuales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void goServicios(View v){
        Intent servicios = new Intent(this, NvoServicio.class);
        startActivity(servicios);
    }

    public void goGastos(View v){
        Intent gastos = new Intent(this, MainActivity.class);
        startActivity(gastos);
    }

    public void goCompara(View v){
        Intent compara = new Intent(this, Comparar.class);
        startActivity(compara);
    }
}