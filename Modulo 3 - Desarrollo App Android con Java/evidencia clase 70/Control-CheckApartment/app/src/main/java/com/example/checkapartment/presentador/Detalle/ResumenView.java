package com.example.checkapartment.presentador.Detalle;

public interface ResumenView {

    void llenarViews(String buildingName, String unitId, String urlImageBuilding);
    boolean isLucesChecked();
    boolean isDormitorioChecked();
    boolean isCocinaChecked();
    boolean isBanioChecked();
    int getRadioPosition();
    void mostrarPuntaje(String puntaje);
    void enviarMail(String buildingName, String unitId, int puntaje);
    void activarBoton();
}
