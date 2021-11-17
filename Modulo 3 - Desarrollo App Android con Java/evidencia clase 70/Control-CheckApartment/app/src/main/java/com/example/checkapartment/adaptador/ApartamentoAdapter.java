package com.example.checkapartment.adaptador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.checkapartment.R;
import com.example.checkapartment.databinding.ItemLayoutBinding;
import com.example.checkapartment.modelo.Apartment.Apartment;
import com.example.checkapartment.vista.DetalleFragment;

import java.util.ArrayList;
import java.util.List;

public class ApartamentoAdapter extends RecyclerView.Adapter<ApartamentoAdapter.CustomViewHolder>{

    private ArrayList<Apartment> lista;
    private OnClickListener listener;

    public ApartamentoAdapter(ArrayList<Apartment> lista){
        this.lista = lista;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new CustomViewHolder(view, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {

        holder.bindData(lista.get(position));

    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {
        private ItemLayoutBinding binding;
        private OnClickListener listener;

        public CustomViewHolder(@NonNull View itemView, OnClickListener listener) {
            super(itemView);
            binding = ItemLayoutBinding.bind(itemView);
            this.listener = listener;
        }

        public void bindData(Apartment apartamento){
            binding.tvProyecto.setText(apartamento.getProyecto());
            binding.tvTorre.setText(apartamento.getTorre());
            binding.tvDepto.setText(apartamento.getDepto());
            itemView.setOnClickListener(v -> {
                listener.onApartmentClick(apartamento);
            });
        }
    }

    public interface OnClickListener{
        void onApartmentClick(Apartment apartment);
    }

    public void setListener(OnClickListener listener){
        this.listener = listener;
    }
}
