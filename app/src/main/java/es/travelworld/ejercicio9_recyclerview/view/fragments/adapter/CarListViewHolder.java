package es.travelworld.ejercicio9_recyclerview.view.fragments.adapter;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.RecyclerView;

import es.travelworld.ejercicio9_recyclerview.R;
import es.travelworld.ejercicio9_recyclerview.databinding.ItemlayoutCarListBinding;
import es.travelworld.ejercicio9_recyclerview.domain.CarItem;

public class CarListViewHolder extends RecyclerView.ViewHolder {

    private ItemlayoutCarListBinding binding;

    public CarListViewHolder(@NonNull ItemlayoutCarListBinding bindingView) {
        super(bindingView.getRoot());
        this.binding = bindingView;
    }

    public void bind(CarItem carItem) {
        binding.carName.setText(carItem.getCarName());
        binding.carPhoto.setImageResource(getImageFromTypeCar(carItem.getCarType()));
        binding.carPrice.setText(itemView.getContext().getString(R.string.price_car,carItem.getCarPrice()));

        //getColor(carItem.getCarType());
    }

    private void getColor(String carType) {
        Drawable tintDrawable = binding.cardItem.getBackground();
        DrawableCompat.wrap(tintDrawable);
        DrawableCompat.setTint(tintDrawable, ContextCompat.getColor(itemView.getContext(),R.color.electric_car));
        //TODO Estructura para aplicar color
    }

    private int getImageFromTypeCar(String carType) {
        switch (carType){
            case "sport":
                return R.drawable.sport_cart;
            case "flying":
                return R.drawable.flying_car;
            case "electric":
                return R.drawable.electric_car;
            case "motor_home":
                return R.drawable.motor_home;
            case "pick_up":
                return R.drawable.pick_up_car;
            case "airplane":
                return R.drawable.air_plain;
            case "bus":
                return R.drawable.bus;
            default:
                return R.drawable.classic_car;
        }
    }
}
