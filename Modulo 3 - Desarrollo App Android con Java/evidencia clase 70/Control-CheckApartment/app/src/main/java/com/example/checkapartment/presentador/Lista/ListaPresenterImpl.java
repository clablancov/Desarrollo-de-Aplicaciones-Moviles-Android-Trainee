package com.example.checkapartment.presentador.Lista;

import android.content.Context;
import android.os.Bundle;

import androidx.recyclerview.widget.RecyclerView;

import com.example.checkapartment.adaptador.ApartamentoAdapter;
import com.example.checkapartment.modelo.Apartment.Apartment;
import com.example.checkapartment.modelo.Apartment.ApartmentData;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaPresenterImpl implements ListaPresenter{

    private ListaView vista;

    public ListaPresenterImpl(ListaView vista){
        this.vista = vista;
    }


    @Override
    public void generarAdapter() {
        ApartamentoAdapter adapter = new ApartamentoAdapter((ArrayList<Apartment>) ApartmentData.apartmentList());
        vista.llenarRecycler(adapter);
    }

    @Override
    public void generarBundle(Apartment apartment) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("apartment", apartment);
        vista.seleccionarItem(bundle);
    }
}
