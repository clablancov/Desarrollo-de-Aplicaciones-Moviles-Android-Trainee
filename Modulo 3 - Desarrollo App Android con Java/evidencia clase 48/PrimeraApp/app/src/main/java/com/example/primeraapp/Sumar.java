package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Sumar extends AppCompatActivity {

    private EditText num1, num2;
    private TextView resulSuma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumar);

        num1 = findViewById(R.id.numero1);
        num2 = findViewById(R.id.numero2);
        resulSuma = findViewById(R.id.resultado);
    }

    public void sumar(View v){
        int valor1 = Integer.parseInt(num1.getText().toString());
        int valor2 = Integer.parseInt(num2.getText().toString());

        int suma = valor1 + valor2;
        resulSuma.setText("El resultado de la suma es " + suma);
    }

    public void nextInicio(View v){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }
}