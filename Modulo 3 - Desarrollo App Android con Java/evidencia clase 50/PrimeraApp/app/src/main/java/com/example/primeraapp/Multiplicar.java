package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Multiplicar extends AppCompatActivity {

    private EditText num1, num2;
    private TextView resulMultiplica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicar);

        num1 = findViewById(R.id.numero5);
        num2 = findViewById(R.id.numero4);
        resulMultiplica = findViewById(R.id.resultado3);
    }

    public void multiplicar(View v){
        int valor1 = Integer.parseInt(num1.getText().toString());
        int valor2 = Integer.parseInt(num2.getText().toString());

        int multiplica = valor1 * valor2;
        resulMultiplica.setText("El resultado de la suma es " + multiplica);
    }

    public void nextInicio(View v){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }
}