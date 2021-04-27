package uz.flowerry.ui.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.ms.square.android.expandabletextview.ExpandableTextView;


import java.util.ArrayList;
import java.util.List;

import uz.flowerry.R;
import uz.flowerry.room.FlowerDatabase;
import uz.flowerry.room.entity.FlowerEntity;


public class RecomendedClickFragment extends Fragment {

    TextView expText;
    Button btnAddCart;
    ImageView recomendedGoBack;



    public RecomendedClickFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_recomended_click, container, false);

        return root;
    }
    // Click new Fragment

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        int a = getArguments().getInt("image");
        expText = view.findViewById(R.id.expandable_text);
        btnAddCart= view.findViewById(R.id.btn_add_cart);
        recomendedGoBack = view.findViewById(R.id.recomended_go_back);

        recomendedGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });



        btnAddCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putInt("cart",a);
                addToDatabase();

                Navigation.findNavController(v).navigate(R.id.cartFragment,bundle);
            }
        });


        // Image slider

        ImageSlider imageSlider = view.findViewById(R.id.image_slider);
        List<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(a, null, ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.flower_5, null, ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.flower_4, null, ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.flower_3, null, ScaleTypes.CENTER_CROP));

        imageSlider.setImageList(slideModels);

        Button btn = view.findViewById(R.id.btnmore);
        btn.setOnClickListener(v -> {
            
            expText.setMaxLines(100);
            expText.setMaxLines(5);
        });

    }

    public void addToDatabase(){

        new Thread(() -> {
            FlowerEntity s = new FlowerEntity();
//            s.setTitle();

            FlowerDatabase.getDatabase(getContext()).getFlowerDao().insert(s);
        }).start();

    }
}