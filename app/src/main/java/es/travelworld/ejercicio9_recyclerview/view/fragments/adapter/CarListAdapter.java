package es.travelworld.ejercicio9_recyclerview.view.fragments.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import es.travelworld.ejercicio9_recyclerview.databinding.ItemlayoutCarListBinding;

public class CarListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    //TODO: crear constructor para recibir la lista de items

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemlayoutCarListBinding binding = ItemlayoutCarListBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);



        return new CarListViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        //obtener el item de la lista segun su posicion
        //bindear viewholder con metodo bind
    }

    @Override
    public int getItemCount() {
        //TODO: devolver el size de la lista
        return 0;
    }
}
