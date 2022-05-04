package es.travelworld.ejercicio9_recyclerview.view.fragments.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import es.travelworld.ejercicio9_recyclerview.databinding.ItemlayoutCarListBinding;
import es.travelworld.ejercicio9_recyclerview.domain.CarItem;

public class CarListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    //TODO: crear constructor para recibir la lista de items

    private List<CarItem> items;

    public CarListAdapter(List<CarItem> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemlayoutCarListBinding binding = ItemlayoutCarListBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new CarListViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof CarListViewHolder){
            ((CarListViewHolder)holder).bind(items.get(position));
        }

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
