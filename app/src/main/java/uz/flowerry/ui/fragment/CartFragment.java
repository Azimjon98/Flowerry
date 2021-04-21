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
import android.widget.ImageView;
import android.widget.TextView;

import uz.flowerry.R;


public class CartFragment extends Fragment {



    TextView value;
    ImageView plus, minus;
    int count = 0;

    public CartFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_cart, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        value = view.findViewById(R.id.value);
        plus = view.findViewById(R.id.plus);
        minus = view.findViewById(R.id.minus);

     plus.setOnClickListener(new View.OnClickListener() {
          @Override
              public void onClick(View v) {
              increment();
         }
      });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrement();
            }
        });


        int b = getArguments().getInt("cart");
        int d= getArguments().getInt("basket");




    }

    private void decrement() {
        if (count<=0) count=0;
        else
            count--;
        value.setText("" + count);
    }

    private void increment() {
        count++;
        value.setText("" + count);
    }

}