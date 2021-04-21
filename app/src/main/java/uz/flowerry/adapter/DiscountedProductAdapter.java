package uz.flowerry.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import uz.flowerry.R;
import uz.flowerry.model.DiscountedProducts;

public class DiscountedProductAdapter extends RecyclerView.Adapter<DiscountedProductAdapter.DiscountedProductViewHolder> {
    Context context;
    List<DiscountedProducts> discountedProductsList;

    public DiscountedProductAdapter(Context context, List<DiscountedProducts> discountedProductsList) {
        this.context = context;
        this.discountedProductsList = discountedProductsList; //items Malumtlar turadi
                                                              // view holder ga viewlar turadi
    }

    @NonNull
    @Override
    public DiscountedProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.discounted_row_items , parent, false);
        return new DiscountedProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DiscountedProductViewHolder holder, int position) {
        holder.discountedImageView.setImageResource(discountedProductsList.get(position).getImageUrl());
        holder.textView.setText((CharSequence) discountedProductsList.get(position).getText());
    }

    @Override
    public int getItemCount()
    {
        return discountedProductsList.size() ;
    }

    public class DiscountedProductViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView discountedImageView;

        public DiscountedProductViewHolder(@NonNull View itemView) {
            super(itemView);
            discountedImageView = itemView.findViewById(R.id.discountImage);
            textView  = itemView.findViewById(R.id.discountedText);
        }
    }
}
