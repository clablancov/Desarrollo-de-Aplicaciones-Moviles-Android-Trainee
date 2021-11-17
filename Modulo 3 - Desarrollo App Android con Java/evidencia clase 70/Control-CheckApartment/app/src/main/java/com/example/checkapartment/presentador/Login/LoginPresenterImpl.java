package com.example.checkapartment.presentador.Login;

import com.example.checkapartment.modelo.Usuario.Usuario;
import com.example.checkapartment.modelo.Usuario.UsuarioData;
import com.example.checkapartment.vista.LoginActivity;

import java.util.ArrayList;
import java.util.List;

public class LoginPresenterImpl implements LoginPresenter{

    private LoginView vista;
    private int intentos = 0;

    public LoginPresenterImpl(LoginView vista) {
        this.vista = vista;
    }

    @Override
    public void verificaLogin(String email, String password) {

        if(email.trim().isEmpty() || password.trim().isEmpty()){
            vista.mensajeVacio();
        }
        else {
            ArrayList<Usuario> usuarioList = UsuarioData.usuarioList();
            int contUsuario = usuarioList.size();
            boolean flag = false;
            for (int i = 0; i < contUsuario; i++){
                String mail = usuarioList.get(i).getEmail();
                String pass = usuarioList.get(i).getPassword();
                if(mail.equals(email) && pass.equals(password)){
                    flag = false;
                    break;
                }
                else{
                    flag = true;
                }
            }
            if(flag){
                intentos++;
                if(intentos >= 3) {
                    vista.bloqueoBoton();
                }
                vista.mensajeError(intentos);
            }
            else{
                vista.ingresoExitoso();
            }
        }
    }
}
