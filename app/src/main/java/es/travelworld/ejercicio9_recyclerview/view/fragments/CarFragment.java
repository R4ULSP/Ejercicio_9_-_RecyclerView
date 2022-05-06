package es.travelworld.ejercicio9_recyclerview.view.fragments;

import static es.travelworld.ejercicio9_recyclerview.domain.References.PRUEBAS;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import es.travelworld.ejercicio9_recyclerview.databinding.FragmentCarBinding;
import es.travelworld.ejercicio9_recyclerview.domain.CarItem;
import es.travelworld.ejercicio9_recyclerview.domain.ResourcesCar;
import es.travelworld.ejercicio9_recyclerview.view.fragments.adapter.CarListAdapter;


public class CarFragment extends Fragment {

    private FragmentCarBinding binding;

    public CarFragment() {
        // Required empty public constructor
    }

    public static CarFragment newInstance() {
        return new CarFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCarBinding.inflate(inflater, container, false);

        setUpRecycler(binding);

        return binding.getRoot();
    }

    private void setUpRecycler(FragmentCarBinding binding) {
        binding.carList.setHasFixedSize(true);
        binding.carList.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.carList.setAdapter(new CarListAdapter(getCarList()));
        Log.d(PRUEBAS,"Entra en el setUp");
    }

    private List<CarItem> getCarList() {
        List<CarItem> list = new ArrayList<>();
        //TODO revisar que hacer con el resourcesCar
        list.add(new CarItem(34f, "classic", "Classic Car", new ResourcesCar("classic")));
        list.add(new CarItem(55f, "sport", "Sport Car", new ResourcesCar("sport")));
        list.add(new CarItem(500f, "flying", "Flying Car", new ResourcesCar("flying")));
        list.add(new CarItem(45f, "electric", "Electric Car", new ResourcesCar("electric")));
        list.add(new CarItem(23f, "motor_home", "Motorhome", new ResourcesCar("motor_home")));
        list.add(new CarItem(10f, "pick_up", "Pickup", new ResourcesCar("pick_up")));
        list.add(new CarItem(11f, "airplane", "Airplane", new ResourcesCar("airplane")));
        list.add(new CarItem(14f, "bus", "Bus", new ResourcesCar("bus")));

        return list;
    }
}