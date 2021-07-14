package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Restar extends AppCompatActivity {

    private EditText num1, num2;
    private TextView resulResta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restar);

        num1 = findViewById(R.id.numero3);
        num2 = findViewById(R.id.numero);
        resulResta = findViewById(R.id.resultado2);
    }

    public void restar(View v){
        int valor1 = Integer.parseInt(num1.getText().toString());
        int valor2 = Integer.parseInt(num2.getText().toString());

        int resta = valor1 - valor2;
        resulResta.setText("El resultado de la suma es " + resta);
    }

    public void nextInicio(View v){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }
}