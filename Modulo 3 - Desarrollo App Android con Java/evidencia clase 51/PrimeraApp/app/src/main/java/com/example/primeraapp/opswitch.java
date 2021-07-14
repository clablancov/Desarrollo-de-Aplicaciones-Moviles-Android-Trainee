package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class opswitch extends AppCompatActivity {

    private Switch swsuma, swresta, swmultiplica, swdivide;
    private EditText opnum1, opnum2;
    private TextView tvres, tvnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opswitch);
        swsuma = findViewById(R.id.swsumar);
        swresta = findViewById(R.id.swresta);
        swmultiplica = findViewById(R.id.swmultiplica);
        swdivide = findViewById(R.id.swdivide);
        opnum1 = findViewById(R.id.num5);
        opnum2 = findViewById(R.id.num4);
        tvres = findViewById(R.id.cbresultado2);
        tvnombre = findViewById(R.id.tvNombre);
        tvnombre.setText("Estas en Switch, " + getIntent().getStringExtra("nombre"));
    }

    //se agrega operaciones para radiobutton
    public void operacion(View v){
        if(swsuma.isChecked()){
            int suma = Integer.parseInt(opnum1.getText().toString()) + Integer.parseInt(opnum2.getText().toString());
            tvres.setText("El Resultado es: " + suma);
        }
        else if(swresta.isChecked()){
            int suma = Integer.parseInt(opnum1.getText().toString()) - Integer.parseInt(opnum2.getText().toString());
            tvres.setText("El Resultado es: " + suma);
        }
        else if(swmultiplica.isChecked()){
            int suma = Integer.parseInt(opnum1.getText().toString()) * Integer.parseInt(opnum2.getText().toString());
            tvres.setText("El Resultado es: " + suma);
        }
        else if(swdivide.isChecked()){
            int suma = Integer.parseInt(opnum1.getText().toString()) / Integer.parseInt(opnum2.getText().toString());
            tvres.setText("El Resultado es: " + suma);
        }
    }

    public void nextInicio(View v){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }
}