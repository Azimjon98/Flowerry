package uz.flowerry.adapter;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import uz.flowerry.R;
import uz.flowerry.model.ThirdProducts;

public class ThirdAdapter extends RecyclerView.Adapter<ThirdAdapter.ThirdViewHolder> {

     Context context;
     List<ThirdProducts> thirdProducts;

    public ThirdAdapter(Context context, List<ThirdProducts> thirdProducts) {
        this.context = context;
        this.thirdProducts = thirdProducts;
    }

    @NonNull
    @Override
    public ThirdViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.third_recycler_item, parent,false);
        return new ThirdViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ThirdViewHolder holder, int position) {
        holder.thirdImage.setImageResource(thirdProducts.get(position).getThirdImage());
        holder.thirdText1.setText(thirdProducts.get(position).getThirdText());
        holder.thirdText2.setText(String.valueOf(thirdProducts.get(position).getThirdTextSum()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putInt("third", thirdProducts.get(position).getThirdImage());
                Navigation.findNavController(v).navigate(R.id.thirdClickFragment,bundle);
            }
        });
    }

    @Override
    public int getItemCount() {
        return thirdProducts.size();
    }

    public static class ThirdViewHolder extends RecyclerView.ViewHolder{
        ImageView thirdImage;
        TextView thirdText1, thirdText2;

        public ThirdViewHolder(@NonNull View itemView) {
            super(itemView);
            thirdImage = itemView.findViewById(R.id.third_Image);
            thirdText1 = itemView.findViewById(R.id.third_Text1);
            thirdText2 = itemView.findViewById(R.id.third_Text2);
        }
    }
}
