package com.example.checkapartment.presentador.Detalle;


import android.os.Bundle;

import com.example.checkapartment.modelo.Apartment.Apartment;

public class ResumenPresenterImpl implements ResumenPresenter{

    private ResumenView view;
    Apartment apartment;
    int puntaje;

    public ResumenPresenterImpl(ResumenView view){
        this.view = view;
    }

    @Override
    public void obtenerDepto(Bundle bundle) {
        apartment = (Apartment) bundle.getSerializable("apartment");
        view.llenarViews(apartment.getProyecto(), apartment.getDepto(), apartment.getFoto());
    }

    @Override
    public void calcularPuntaje() {
        puntaje = 0;
        if (view.isLucesChecked())
        {
            puntaje += 10;
        }
        if (view.isDormitorioChecked())
        {
            puntaje += 20;
        }
        if(view.isCocinaChecked())
        {
            puntaje += 30;
        }
        if (view.isBanioChecked())
        {
            puntaje += 40;
        }
        switch(view.getRadioPosition())
        {
            case 0: puntaje *= 3; break;
            case 1: puntaje *= 2; break;
        }
        view.mostrarPuntaje(String.valueOf(puntaje));

        if (puntaje < 130)
        {
            view.activarBoton();
        }
    }

    @Override
    public void generarAlerta() {
        view.enviarMail(apartment.getProyecto(),apartment.getDepto(),puntaje);
    }
}
