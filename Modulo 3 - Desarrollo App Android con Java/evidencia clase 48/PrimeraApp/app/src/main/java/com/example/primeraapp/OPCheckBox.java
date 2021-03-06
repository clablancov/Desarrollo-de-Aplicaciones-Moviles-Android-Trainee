package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class OPCheckBox extends AppCompatActivity {
    private CheckBox csuma, cresta, cmultiplica, cdivide;
    private TextView resultado;
    private EditText n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcheck_box);

        csuma = findViewById(R.id.cbsuma);
        cresta = findViewById(R.id.cbresta);
        cmultiplica = findViewById(R.id.cbmultiplica);
        cdivide = findViewById(R.id.cbdivide);
        resultado = findViewById(R.id.cbresultado);
        n1 = findViewById(R.id.num1);
        n2 = findViewById(R.id.num2);
    }

    //se agrega operaciones para radiobutton
    public void operacion(View v){
        if(csuma.isChecked()){
            int suma = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
            resultado.setText("El Resultado es: " + suma);
        }
        else if(cresta.isChecked()){
            int suma = Integer.parseInt(n1.getText().toString()) - Integer.parseInt(n2.getText().toString());
            resultado.setText("El Resultado es: " + suma);
        }
        else if(cmultiplica.isChecked()){
            int suma = Integer.parseInt(n1.getText().toString()) * Integer.parseInt(n2.getText().toString());
            resultado.setText("El Resultado es: " + suma);
        }
        else if(cdivide.isChecked()){
            int suma = Integer.parseInt(n1.getText().toString()) / Integer.parseInt(n2.getText().toString());
            resultado.setText("El Resultado es: " + suma);
        }
    }

    public void nextInicio(View v){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }
}