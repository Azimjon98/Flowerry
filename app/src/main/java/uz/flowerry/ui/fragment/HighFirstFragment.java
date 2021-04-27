package uz.flowerry.ui.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import uz.flowerry.R;
import uz.flowerry.adapter.DiscountedProductAdapter;
import uz.flowerry.adapter.HighFIrstAdapter;
import uz.flowerry.model.DiscountedProducts;
import uz.flowerry.model.HighFirstProduct;


public class HighFirstFragment extends Fragment {

    RecyclerView RecyclerHighFirst;

    HighFIrstAdapter highFIrstAdapter;
    List<HighFirstProduct> highFirstProducts;

    public HighFirstFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_high_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerHighFirst =view.findViewById(R.id.High_First_recycler);

        int h = getArguments().getInt("HighFirst");


        highFirstProducts = new ArrayList<>();
        highFirstProducts.add(new HighFirstProduct(R.drawable.flofers_hd_2, "Birthday gifts botique", 14000));
        highFirstProducts.add(new HighFirstProduct(R.drawable.flofers_hd_2, "Birthday gifts botique", 14000));
        highFirstProducts.add(new HighFirstProduct(R.drawable.flofers_hd_2, "Birthday gifts botique", 14000));
        highFirstProducts.add(new HighFirstProduct(R.drawable.flofers_hd_2, "Birthday gifts botique", 14000));
        highFirstProducts.add(new HighFirstProduct(R.drawable.flofers_hd_2, "Birthday gifts botique", 14000));
        highFirstProducts.add(new HighFirstProduct(R.drawable.flofers_hd_2, "Birthday gifts botique", 14000));
        highFirstProducts.add(new HighFirstProduct(R.drawable.flofers_hd_2, "Birthday gifts botique", 14000));
        highFirstProducts.add(new HighFirstProduct(R.drawable.flofers_hd_2, "Birthday gifts botique", 14000));
        highFirstProducts.add(new HighFirstProduct(R.drawable.flofers_hd_2, "Birthday gifts botique", 14000));
        highFirstProducts.add(new HighFirstProduct(R.drawable.flofers_hd_2, "Birthday gifts botique", 14000));
        highFirstProducts.add(new HighFirstProduct(R.drawable.flofers_hd_2, "Birthday gifts botique", 14000));
        highFirstProducts.add(new HighFirstProduct(R.drawable.flofers_hd_2, "Birthday gifts botique", 14000));
        highFirstProducts.add(new HighFirstProduct(R.drawable.flofers_hd_2, "Birthday gifts botique", 14000));
        highFirstProducts.add(new HighFirstProduct(R.drawable.flofers_hd_2, "Birthday gifts botique", 14000));
        highFirstProducts.add(new HighFirstProduct(R.drawable.flofers_hd_2, "Birthday gifts botique", 14000));
        highFirstProducts.add(new HighFirstProduct(R.drawable.flofers_hd_2, "Birthday gifts botique", 14000));
        setRecyclerHighFirst(highFirstProducts);
    }
    private void setRecyclerHighFirst(List<HighFirstProduct> highFirstProductList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        RecyclerHighFirst.setLayoutManager(layoutManager);
        highFIrstAdapter = new HighFIrstAdapter(getContext(), highFirstProductList);
        RecyclerHighFirst.setAdapter(highFIrstAdapter);
}}