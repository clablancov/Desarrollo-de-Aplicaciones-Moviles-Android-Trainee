package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.etnombre);
    }

    public void nextSuma(View v){
        Intent suma = new Intent(this, Sumar.class);
        suma.putExtra("nombre", nombre.getText().toString());
        startActivity(suma);
    }

    public void nextResta(View v){
        Intent resta = new Intent(this, Restar.class);
        resta.putExtra("nombre", nombre.getText().toString());
        startActivity(resta);
    }

    public void nextMultiplica(View v){
        Intent multiplica = new Intent(this, Multiplicar.class);
        multiplica.putExtra("nombre", nombre.getText().toString());
        startActivity(multiplica);
    }

    public void nextDivide(View v){
        Intent divide = new Intent(this, Dividir.class);
        divide.putExtra("nombre", nombre.getText().toString());
        startActivity(divide);
    }
    public void nextoprb(View v){
        Intent oprb = new Intent(this, OPRadioButton.class);
        oprb.putExtra("nombre", nombre.getText().toString());
        startActivity(oprb);
    }
    public void nextopcb(View v){
        Intent opcb = new Intent(this, OPCheckBox.class);
        opcb.putExtra("nombre", nombre.getText().toString());
        startActivity(opcb);
    }
    public void nextopsw(View v){
        Intent opsw = new Intent(this, opswitch.class);
        opsw.putExtra("nombre", nombre.getText().toString());
        startActivity(opsw);
    }
    public void nextopspinner(View v){
        Intent opsp = new Intent(this, opSpinner.class);
        opsp.putExtra("nombre", nombre.getText().toString());
        startActivity(opsp);
    }
}