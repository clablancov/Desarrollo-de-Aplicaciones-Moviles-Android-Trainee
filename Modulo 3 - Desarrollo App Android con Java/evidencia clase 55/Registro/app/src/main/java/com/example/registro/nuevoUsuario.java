package com.example.registro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class nuevoUsuario extends AppCompatActivity {

    private TextView nombres, apellidos, direccion, email, telefono, sexo, novedades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_usuario);

        nombres = findViewById(R.id.tvnombres);
        apellidos = findViewById(R.id.tvapellidos);
        direccion = findViewById(R.id.tvdireccion);
        email = findViewById(R.id.tvmail);
        telefono = findViewById(R.id.tvtelefono);
        sexo = findViewById(R.id.tvsexo);
        novedades = findViewById(R.id.tvnovedades);

        // DESDE EL INTENT
        nombres.setText("Nombres: " + getIntent().getStringExtra("nombres"));
        apellidos.setText("Apellidos: " + getIntent().getStringExtra("apellidos"));
        direccion.setText("Dirección: " + getIntent().getStringExtra("direccion"));
        email.setText("E-mail: " + getIntent().getStringExtra("email"));
        telefono.setText("Telefono: " + getIntent().getStringExtra("telefono"));
        sexo.setText("Sexo: " + getIntent().getStringExtra("sexo"));
        if(getIntent().getBooleanExtra("novedades", true)) novedades.setText("ESTAS SUSCRITO AL ENVIO DE NOVEDADES POR CORREO!!");
        else novedades.setText("NO ESTAS SUSCRITO AL ENVIO DE NOVEDADES, PUEDES CAMBIAR ESTO MAS ADELANTE EN TU PERFIL");
    }

    public void nextInicio(View v){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }
}