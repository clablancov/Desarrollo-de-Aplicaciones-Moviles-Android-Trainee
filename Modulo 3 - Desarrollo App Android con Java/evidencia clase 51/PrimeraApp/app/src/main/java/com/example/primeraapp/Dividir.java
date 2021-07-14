package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Dividir extends AppCompatActivity {

    private EditText num1, num2;
    private TextView resulDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dividir);

        num1 = findViewById(R.id.numero7);
        num2 = findViewById(R.id.numero6);
        resulDivide = findViewById(R.id.resultado4);
    }

    public void dividir(View v){
        int valor1 = Integer.parseInt(num1.getText().toString());
        int valor2 = Integer.parseInt(num2.getText().toString());

        int divide = valor1 / valor2;
        resulDivide.setText("El resultado de la suma es " + divide);
    }

    public void nextInicio(View v){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }
}