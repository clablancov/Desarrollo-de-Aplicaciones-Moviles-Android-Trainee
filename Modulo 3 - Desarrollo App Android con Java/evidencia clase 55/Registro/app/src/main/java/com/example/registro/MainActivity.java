package com.example.registro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    private EditText nombres, apellidos, email, direccion, telefono;
    private RadioButton masculino, femenino;
    private Switch novedades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombres = findViewById(R.id.etnombres);
        apellidos = findViewById(R.id.etapellidos);
        direccion = findViewById(R.id.dtdireccion);
        email = findViewById(R.id.etmail);
        telefono = findViewById(R.id.ettelefono);
        masculino = findViewById(R.id.rbmasculino);
        femenino = findViewById(R.id.rbfemenino);
        novedades = findViewById(R.id.swnovedades);
    }

    public void registrar(View v){
        Intent newUsuario = new Intent(this, nuevoUsuario.class);
        newUsuario.putExtra("nombres", nombres.getText().toString());
        newUsuario.putExtra("apellidos", apellidos.getText().toString());
        newUsuario.putExtra("direccion", direccion.getText().toString());
        newUsuario.putExtra("email", email.getText().toString());
        newUsuario.putExtra("telefono", telefono.getText().toString());

        if(masculino.isChecked()) newUsuario.putExtra("sexo", "Masculino");
        else if (femenino.isChecked()) newUsuario.putExtra("sexo", "Femenino");

        if (novedades.isChecked()) newUsuario.putExtra("Novedades", true);
        else newUsuario.putExtra("novedades", false);
        startActivity(newUsuario);
    }
}