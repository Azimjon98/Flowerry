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
import uz.flowerry.model.RecomendedProdects;

public class RecomendedAdapter extends RecyclerView.Adapter<RecomendedAdapter.RecomendedViewHolder> {
    Context context;
    List<RecomendedProdects> recomendedProdectsList;

    public RecomendedAdapter(Context context, List<RecomendedProdects> recomendedProdectsList) {
        this.context = context;
        this.recomendedProdectsList = recomendedProdectsList;
    }

    @NonNull
    @Override
    public RecomendedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recommended_recycler_item, parent, false);
        return new RecomendedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecomendedViewHolder holder, int position) {
        holder.recomendedText1.setText(recomendedProdectsList.get(position).getRecomendText());
        holder.recomendedText2.setText(recomendedProdectsList.get(position).getRecomendTextSum());
        holder.recomendedImage.setImageResource(recomendedProdectsList.get(position).getRecomendImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putInt("image", recomendedProdectsList.get(position).getRecomendImage());
                Navigation.findNavController(v).navigate(R.id.action_homeFragment_to_recomendedClickFragment2,bundle);
            }
        });
    }

    @Override
    public int getItemCount() {
        return recomendedProdectsList.size();
    }


    public static class RecomendedViewHolder extends RecyclerView.ViewHolder{
          TextView recomendedText1 , recomendedText2;
          ImageView recomendedImage;

        public RecomendedViewHolder(@NonNull View itemView) {
            super(itemView);

            recomendedImage = itemView.findViewById(R.id.recomendet_image);
            recomendedText1 = itemView.findViewById(R.id.recomendet_text1);
            recomendedText2 = itemView.findViewById(R.id.recomendet_text2);


        }
    }
}
