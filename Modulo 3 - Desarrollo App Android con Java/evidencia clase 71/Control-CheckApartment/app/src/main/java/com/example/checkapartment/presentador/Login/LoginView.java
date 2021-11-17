package com.example.checkapartment.presentador.Login;

public interface LoginView {
    void mensajeError(int intentos);
    void ingresoExitoso();
    void bloqueoBoton();
    void mensajeVacio();
}
