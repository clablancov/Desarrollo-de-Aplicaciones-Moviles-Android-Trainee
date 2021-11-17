package com.example.checkapartment.vista;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.checkapartment.R;
import com.example.checkapartment.adaptador.ApartamentoAdapter;
import com.example.checkapartment.databinding.FragmentListaBinding;
import com.example.checkapartment.presentador.Lista.ListaPresenterImpl;
import com.example.checkapartment.presentador.Lista.ListaView;

public class ListaFragment extends Fragment implements ListaView {

    private FragmentListaBinding binding;
    private ListaPresenterImpl presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentListaBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        presenter = new ListaPresenterImpl(this);
        presenter.generarAdapter();
    }

    @Override
    public void llenarRecycler(ApartamentoAdapter adapter) {
        binding.rvLista.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.rvLista.setAdapter(adapter);

        adapter.setListener(apartment -> {
            presenter.generarBundle(apartment);
        });
    }

    @Override
    public void seleccionarItem(Bundle bundle) {
        Navigation.findNavController(getView()).navigate(R.id.action_listaFragment_to_detalleFragment,bundle);
    }
}