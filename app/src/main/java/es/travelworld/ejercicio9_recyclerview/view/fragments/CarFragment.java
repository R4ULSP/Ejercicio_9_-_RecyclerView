package es.travelworld.ejercicio9_recyclerview.view.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCarBinding.inflate(inflater, container, false);

        setUpRecycler(binding);

        return binding.getRoot();
    }

    private void setUpRecycler(FragmentCarBinding binding) {
        binding.carList.setHasFixedSize(true);
        binding.carList.setAdapter(new CarListAdapter(getCarList()));
    }

    private List<CarItem> getCarList() {
        List<CarItem> list = new ArrayList<>();
        list.add(new CarItem(34, "classic", "Classic Car", new ResourcesCar("classic")));
        list.add(new CarItem(55, "sport", "Sport Car", new ResourcesCar("sport")));
        list.add(new CarItem(500, "flying", "Flying Car", new ResourcesCar("flying")));
        list.add(new CarItem(45, "electric", "Electric Car", new ResourcesCar("electric")));
        list.add(new CarItem(23, "motor_home", "Motorhome", new ResourcesCar("motor_home")));
        list.add(new CarItem(10, "pick_up", "Pickup", new ResourcesCar("pick_up")));
        list.add(new CarItem(11, "airplane", "Airplane", new ResourcesCar("airplane")));
        list.add(new CarItem(14, "bus", "Bus", new ResourcesCar("bus")));

        return list;
    }
}