package uz.flowerry.ui.fragment;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

import uz.flowerry.R;
import uz.flowerry.adapter.DiscountedProductAdapter;
import uz.flowerry.adapter.NewsImageAdapter;
import uz.flowerry.adapter.RecomendedAdapter;
import uz.flowerry.model.DiscountedProducts;
import uz.flowerry.model.NewsImagesproduct;
import uz.flowerry.model.RecomendedProdects;

public class  FragmentHome extends Fragment {


    RecyclerView discountRecyclerView, newsRecyclerView, recommended_Recycler;
    DiscountedProductAdapter discountedProductAdapter;
    List<DiscountedProducts> discountedProductsList;

    NewsImageAdapter  newsImageAdapter;
    List<NewsImagesproduct> newsImagesList;

    RecomendedAdapter recomendedAdapter;
    List<RecomendedProdects> recomendedProdectsList;

    ImageView imageView;
    ImageView buttonSheets;

    ImageView imagebacket;




    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        discountRecyclerView = view.findViewById(R.id.discountedRecycler);
        newsRecyclerView = view.findViewById(R.id.newsRecycler);
        recommended_Recycler = view.findViewById(R.id.recommended_recycler);
        imageView = view.findViewById(R.id.icon_share);
        buttonSheets = view.findViewById(R.id.shop_name);
        imagebacket = view.findViewById(R.id.icon_basket);

        imagebacket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putInt("basket",0);
                Navigation.findNavController(v).navigate(R.id.cartFragment);
            }
        });



       //////////////////_// ICON_SHARE____________________

        imageView.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Insert Subject here");
                String app_url = "https://play.google.com/store/apps/details?id=my.example.javatpoint";
                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,app_url);
                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        }));
        //////////////////_//  BottomShets________________________
        

        buttonSheets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheets bottomSheets = new BottomSheets();
                bottomSheets.show(getParentFragmentManager(), "TAG");
            }
        });





        discountedProductsList = new ArrayList<>();
        discountedProductsList.add(new DiscountedProducts(1, R.drawable.flower_2, "Deals"));
        discountedProductsList.add(new DiscountedProducts(2, R.drawable.flower_1, "Flowers"));
        discountedProductsList.add(new DiscountedProducts(3, R.drawable.flower_3, "Cakes"));
        discountedProductsList.add(new DiscountedProducts(4, R.drawable.flower_4,"Cupcaces"));
        discountedProductsList.add(new DiscountedProducts(5, R.drawable.flower_5, "LivePlants"));
        discountedProductsList.add(new DiscountedProducts(6, R.drawable.flower_6, "Coffe "));
        discountedProductsList.add(new DiscountedProducts(7, R.drawable.flower_2,"Flowes "));
        discountedProductsList.add(new DiscountedProducts(8, R.drawable.flower_1, "Decor"));
        discountedProductsList.add(new DiscountedProducts(9, R.drawable.flower_3, "accesories"));
        setDiscountedRecycler(discountedProductsList);

        newsImagesList = new ArrayList<>();
        newsImagesList.add(new NewsImagesproduct(R.drawable.flower_1));
        newsImagesList.add(new NewsImagesproduct(R.drawable.flower_hd_4));
        newsImagesList.add(new NewsImagesproduct(R.drawable.flowes_hd_3));
        newsImagesList.add(new NewsImagesproduct(R.drawable.flofers_hd_2));
        setNewsRecycler(newsImagesList);

        recomendedProdectsList = new ArrayList<>();
       recomendedProdectsList.add(new RecomendedProdects(R.drawable.flover_hd_1, "Birthday Gift",450));
       recomendedProdectsList.add(new RecomendedProdects(R.drawable.flofers_hd_2, "Birthday Gift",450));
       recomendedProdectsList.add(new RecomendedProdects(R.drawable.flowes_hd_3, "Birthday Gift",450));
       recomendedProdectsList.add(new RecomendedProdects(R.drawable.flower_hd_4, "Birthday Gift",450));
       recomendedProdectsList.add(new RecomendedProdects(R.drawable.flower_2, "ehhgfuewofyg",450));
       recomendedProdectsList.add(new RecomendedProdects(R.drawable.flower_1, "ehhgfuewofyg",450));
       recomendedProdectsList.add(new RecomendedProdects(R.drawable.flower_6, "ehhgfuewofyg",450));
       recomendedProdectsList.add(new RecomendedProdects(R.drawable.flower_5, "ehhgfuewofyg",450));
       recomendedProdectsList.add(new RecomendedProdects(R.drawable.flower_4, "ehhgfuewofyg",450));
       recomendedProdectsList.add(new RecomendedProdects(R.drawable.flower_3, "ehhgfuewofyg",450));
       recomendedProdectsList.add(new RecomendedProdects(R.drawable.flower_2, "ehhgfuewofyg",450));
       recomendedProdectsList.add(new RecomendedProdects(R.drawable.flower_1, "ehhgfuewofyg",450));
       recomendedProdectsList.add(new RecomendedProdects(R.drawable.flower_6, "ehhgfuewofyg",450));
       recomendedProdectsList.add(new RecomendedProdects(R.drawable.flower_5, "ehhgfuewofyg",450));
       recomendedProdectsList.add(new RecomendedProdects(R.drawable.flower_4, "ehhgfuewofyg",450));
       recomendedProdectsList.add(new RecomendedProdects(R.drawable.flower_4, "ehhgfuewofyg",450));

         setRecommendedRecycler(recomendedProdectsList);

         final NavController navController = Navigation.findNavController(view);

    }

    private void setDiscountedRecycler(List<DiscountedProducts> dataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        discountRecyclerView.setLayoutManager(layoutManager);
        discountedProductAdapter = new DiscountedProductAdapter(getContext(), dataList);
        discountRecyclerView.setAdapter(discountedProductAdapter);
    }
    private void setNewsRecycler(List<NewsImagesproduct> newsImagesList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        newsRecyclerView.setLayoutManager(layoutManager);
        newsImageAdapter = new NewsImageAdapter(getContext(), newsImagesList);
        newsRecyclerView.setAdapter(newsImageAdapter);
    }
    private  void setRecommendedRecycler(List<RecomendedProdects> recomendedProdectsList){
        RecyclerView.LayoutManager layoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL);
        recommended_Recycler.setLayoutManager(layoutManager);
        recomendedAdapter = new RecomendedAdapter(getContext(),recomendedProdectsList);
        recommended_Recycler.setAdapter(recomendedAdapter);

    }


    }

