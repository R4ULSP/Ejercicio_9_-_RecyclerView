package es.travelworld.ejercicio9_recyclerview.view.fragments.adapter;

import static es.travelworld.ejercicio9_recyclerview.domain.References.PRUEBAS;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import es.travelworld.ejercicio9_recyclerview.databinding.ItemlayoutCarListBinding;
import es.travelworld.ejercicio9_recyclerview.domain.CarItem;

public class CarListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final List<CarItem> items;

    public CarListAdapter(List<CarItem> items) {
        this.items = items;
        Log.d(PRUEBAS,"Entra en el constructor del carlist: " + items.size());

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemlayoutCarListBinding binding = ItemlayoutCarListBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);

        Log.d(PRUEBAS,"Entra en el onCreateViewHolder");

        return new CarListViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Log.d(PRUEBAS,"Estoy en la posición: " + position);
        if(holder instanceof CarListViewHolder){
            Log.d(PRUEBAS,"Estoy en la posición: " + position);
            ((CarListViewHolder)holder).bind(items.get(position));
        }

    }

    @Override
    public int getItemCount() {

        return items.size();
    }
}
