package uz.flowerry.ui.fragment;

import android.app.AppComponentFactory;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import uz.flowerry.R;
import uz.flowerry.adapter.DiscountedProductAdapter;
import uz.flowerry.model.DiscountedProducts;

public class MainActivity extends AppCompatActivity {

    RecyclerView discountRecyclerView;
    DiscountedProductAdapter discountedProductAdapter;
    List<DiscountedProducts> discountedProductsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);


        discountRecyclerView = findViewById(R.id.discountedRecycler);

        discountedProductsList = new ArrayList<>();
        discountedProductsList.add(new DiscountedProducts(1, R.drawable.flower_2));
        discountedProductsList.add(new DiscountedProducts(2, R.drawable.flower_1));
        discountedProductsList.add(new DiscountedProducts(3, R.drawable.flower_3));

        setDiscountedRecycler( discountedProductsList);
    }
    private void setDiscountedRecycler(List<DiscountedProducts> dataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        discountRecyclerView.setLayoutManager(layoutManager);
        discountedProductAdapter = new DiscountedProductAdapter(this ,dataList);
        discountRecyclerView.setAdapter(discountedProductAdapter);
    }

}
