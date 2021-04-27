package uz.flowerry.ui.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

import uz.flowerry.R;


public class ThirdClickFragment extends Fragment {

    Button btnAddCartThird;


    public ThirdClickFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_third_click, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnAddCartThird = view.findViewById(R.id.btn_add_cart_third);

        int t = getArguments().getInt("third");

        btnAddCartThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putInt("cartThird",0);
                Navigation.findNavController(v).navigate(R.id.cartFragment,bundle);
            }
        });


        ImageSlider imageSlider = view.findViewById(R.id.image_slider_third);
        List<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(t, null, ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.flower_5, null, ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.flower_4, null, ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.flower_3, null, ScaleTypes.CENTER_CROP));

        imageSlider.setImageList(slideModels);
    }
}