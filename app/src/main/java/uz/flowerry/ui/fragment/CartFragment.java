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
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import uz.flowerry.R;
import uz.flowerry.adapter.DiscountedProductAdapter;
import uz.flowerry.adapter.FragmentCartAdapter;
import uz.flowerry.model.DiscountedProducts;
import uz.flowerry.room.FlowerDatabase;
import uz.flowerry.room.dao.FlowersDao;
import uz.flowerry.room.entity.FlowerEntity;


public class CartFragment extends Fragment {


    FragmentCartAdapter fragmentCartAdapter;
    List<FlowerEntity> fragmentCartItems;

    RecyclerView recyclercartitem;


    ImageView goBackCartFragment;
    int count = 0;

    FlowersDao dao;

    public CartFragment() {
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dao = FlowerDatabase.getDatabase(getContext()).getFlowerDao();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_cart_recycler, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclercartitem = view.findViewById(R.id.recycler_cart);


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclercartitem.setLayoutManager(layoutManager);
        fragmentCartAdapter = new FragmentCartAdapter(getContext(), new ArrayList<>());
        recyclercartitem.setAdapter(fragmentCartAdapter);

        //  value = view.findViewById(R.id.value);
        //  plus = view.findViewById(R.id.plus);
        // minus = view.findViewById(R.id.minus);
        goBackCartFragment = view.findViewById(R.id.go_Back_CartFragment);

        dao.getFlowers().observe(getViewLifecycleOwner(), flowerEntities -> {
            fragmentCartAdapter.fragmentCartItems = flowerEntities;
            fragmentCartAdapter.notifyDataSetChanged();
        });


        goBackCartFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });

        // plus.setOnClickListener(new View.OnClickListener() {
        //   @Override
        //   public void onClick(View v) {
        //      increment();
        // }
        // });
        // minus.setOnClickListener(new View.OnClickListener() {
        //  @Override
        //  public void onClick(View v) {
        //    decrement();
        // }
        // });

        if (getArguments() != null && getArguments().containsKey("cart")) {

            int b = getArguments().getInt("cart");

        }

        if (getArguments() != null && getArguments().containsKey("basket")) {

            int d = getArguments().getInt("basket");

        }
        if (getArguments() != null && getArguments().containsKey("cartNews")) {

            int n = getArguments().getInt("cartNews");

        }
        if (getArguments() != null && getArguments().containsKey("cartThird")) {

            int t = getArguments().getInt("cartThird");

        }


    }

    // private void decrement() {
    //  if (count <= 0) count = 0;
    ////   else
    //      count--;
    //  value.setText("" + count);
    //}

    // private void increment() {
    ////    count++;
    //   value.setText("" + count);
    // }

}