package com.example.checkapartment.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.checkapartment.R;
import com.example.checkapartment.databinding.LoginActivityBinding;
import com.example.checkapartment.presentador.Login.LoginPresenterImpl;
import com.example.checkapartment.presentador.Login.LoginView;

public class LoginActivity extends AppCompatActivity implements LoginView {

    private LoginActivityBinding binding;
    private LoginPresenterImpl presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = LoginActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        presenter = new LoginPresenterImpl(this);

        //consultar por login en presenter
        binding.btIngresar.setOnClickListener(v -> {
            String mail = binding.etEmail.getText().toString();
            String password = binding.etPassword.getText().toString();

            presenter.verificaLogin(mail,password);
        });

    }

    public void mensajeError( int intentos){
        binding.etEmail.setError("Datos Incorrectos");
        binding.etPassword.setError("Datos Incorrectos");
        Toast.makeText(this, "Correo o contraseña erroneos! Nro de intentos: " + intentos, Toast.LENGTH_SHORT).show();
    }

    public void mensajeVacio(){
        binding.etEmail.setError("Ingrese Mail");
        binding.etPassword.setError("Ingrese Password");
        Toast.makeText(this, "Debe completar los campos marcados", Toast.LENGTH_SHORT).show();
    }

    public void ingresoExitoso(){
        Intent insertar = new Intent(this, ApartamentosActivity.class);
        startActivity(insertar);
    }

    public void bloqueoBoton(){
        binding.btIngresar.setEnabled(false);
        Toast.makeText(this, "Aplicación bloqueada por demasiados intentos erroneos!!", Toast.LENGTH_LONG).show();
    }
}