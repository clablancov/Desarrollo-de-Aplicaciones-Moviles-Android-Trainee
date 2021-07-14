package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class opSpinner extends AppCompatActivity {

    private EditText opnum1, opnum2;
    private TextView tvres;
    private Spinner sp;
    private String[] op = {"Sumar", "Restar", "Multiplicar", "Dividir"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_op_spinner);

        opnum1 = findViewById(R.id.num7);
        opnum2 = findViewById(R.id.num6);
        tvres = findViewById(R.id.cbresultado3);
        sp = findViewById(R.id.spinner);

        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, op);
        sp.setAdapter(adaptador);
    }

    public void operar(View v){
        int valor1 = Integer.parseInt(opnum1.getText().toString());
        int valor2 = Integer.parseInt(opnum2.getText().toString());
       String operacion = sp.getSelectedItem().toString();
       if(operacion.equals("Sumar")){
            int res = valor1 + valor2;
            tvres.setText("el resultado es: "+res);
       } else if(operacion.equals("Restar")){
           int res = valor1 - valor2;
           tvres.setText("el resultado es: "+res);
       } else if(operacion.equals("Multiplicar")){
           int res = valor1 * valor2;
           tvres.setText("el resultado es: "+res);
       } else if(operacion.equals("Dividir")){
           int res = valor1 / valor2;
           tvres.setText("el resultado es: "+res);
       }
    }

    public void nextInicio(View v){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }
}