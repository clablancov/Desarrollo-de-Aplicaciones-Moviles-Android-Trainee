package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class OPRadioButton extends AppCompatActivity {
    private RadioButton rsuma, rresta, rmultiplica, rdivide;
    private TextView resultado;
    private EditText n1, n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opradio_button);
        rsuma = findViewById(R.id.rbsuma);
        rresta = findViewById(R.id.rbresta);
        rmultiplica = findViewById(R.id.rbmultiplica);
        rdivide = findViewById(R.id.rbdivide);
        resultado = findViewById(R.id.rbresultado);
        n1 = findViewById(R.id.num1);
        n2 = findViewById(R.id.num2);
    }
    //se agrega operaciones para radiobutton
    public void operacion(View v){
        if(rsuma.isChecked()){
            int suma = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
            resultado.setText("El Resultado es: " + suma);
        }
        else if(rresta.isChecked()){
            int suma = Integer.parseInt(n1.getText().toString()) - Integer.parseInt(n2.getText().toString());
            resultado.setText("El Resultado es: " + suma);
        }
        else if(rmultiplica.isChecked()){
            int suma = Integer.parseInt(n1.getText().toString()) * Integer.parseInt(n2.getText().toString());
            resultado.setText("El Resultado es: " + suma);
        }
        else if(rdivide.isChecked()){
            int suma = Integer.parseInt(n1.getText().toString()) / Integer.parseInt(n2.getText().toString());
            resultado.setText("El Resultado es: " + suma);
        }
    }

    public void nextInicio(View v){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }
}