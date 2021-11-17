package com.example.checkapartment.presentador.Lista;

import android.os.Bundle;

import com.example.checkapartment.adaptador.ApartamentoAdapter;

public interface ListaView {
    void llenarRecycler(ApartamentoAdapter adapter);
    void seleccionarItem(Bundle bundle);
}
