package com.example.checkapartment.vista;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.checkapartment.R;
import com.example.checkapartment.databinding.FragmentDetalleBinding;
import com.example.checkapartment.presentador.Detalle.ResumenPresenterImpl;
import com.example.checkapartment.presentador.Detalle.ResumenView;

public class DetalleFragment extends Fragment implements ResumenView {

    private FragmentDetalleBinding binding;
    private ResumenPresenterImpl presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentDetalleBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        presenter = new ResumenPresenterImpl(this);
        getArguments().getSerializable("apartment");
        presenter.obtenerDepto(getArguments());

        binding.btGuardar.setOnClickListener(v -> {
            presenter.calcularPuntaje();
        });

        binding.btAlerta.setOnClickListener(v -> {
            presenter.generarAlerta();
        });

    }

    @Override
    public void llenarViews(String buildingName, String unitId, String urlImageBuilding) {
        binding.tvCondominio.setText(buildingName);
        binding.tvNumeroDpto.setText(unitId);

        Glide.with(this).load(urlImageBuilding).into(binding.imageViewGlide);
    }

    @Override
    public boolean isLucesChecked() {
        return binding.chkLuces.isChecked();
    }

    @Override
    public boolean isDormitorioChecked() {
        return binding.chkDormitorio.isChecked();
    }

    @Override
    public boolean isCocinaChecked() {
        return binding.chkCocina.isChecked();
    }

    @Override
    public boolean isBanioChecked() {
        return binding.chkBaO.isChecked();
    }

    @Override
    public int getRadioPosition() {
        int radioButtonID = binding.rdgButon.getCheckedRadioButtonId();
        View radioButton = binding.rdgButon.findViewById(radioButtonID);
        int idx = binding.rdgButon.indexOfChild(radioButton);
        return idx;
    }

    @Override
    public void mostrarPuntaje(String puntaje) {
        String t = getString(R.string.tv_resultado) + " " + puntaje + " " + getString(R.string.puntos);
        binding.tvResultado.setText(t);
    }

    @Override
    public void enviarMail(String buildingName, String unitId, int puntaje) {
        String email = "carlos.z.jeria@gmail.com";
        String subject = "carlos.z.jeria@gmail.com";
        String body = String.format("Estimado: el dpto %s del edificio %s obtivo %s puntaje, favor reportarlo, saludos xd"
                ,buildingName,unitId,String.valueOf(puntaje)) ;
        String chooserTitle = "Reporte dpto " + unitId;

        Uri uri = Uri.parse("mailto:" + email)
                .buildUpon()
                .appendQueryParameter("subject", subject)
                .appendQueryParameter("body", body)
                .build();

        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, uri);
        startActivity(Intent.createChooser(emailIntent, chooserTitle));
    }

    @Override
    public void activarBoton() {
        binding.btAlerta.setEnabled(true);
    }
}