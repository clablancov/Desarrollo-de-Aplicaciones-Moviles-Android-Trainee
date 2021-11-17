package com.example.checkapartment.presentador.Lista;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import com.example.checkapartment.modelo.Apartment.Apartment;

public interface ListaPresenter {

    void generarAdapter();
    void generarBundle(Apartment apartment);
}
