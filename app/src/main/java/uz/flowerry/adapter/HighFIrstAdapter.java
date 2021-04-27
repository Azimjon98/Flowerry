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
import uz.flowerry.model.HighFirstProduct;

public class HighFIrstAdapter extends RecyclerView.Adapter<HighFIrstAdapter.HighFirstViewHolder> {
    Context context;
    List<HighFirstProduct> highFirstProducts;

    public HighFIrstAdapter(Context context, List<HighFirstProduct> highFirstProducts) {
        this.context = context;
        this.highFirstProducts = highFirstProducts;
    }
    @NonNull
    @Override
    public HighFirstViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.high_first_recycler_item, parent,false);
        return  new HighFirstViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HighFirstViewHolder holder, int position) {
        holder.highfirstImage.setImageResource(highFirstProducts.get(position).getHighFirstImage());
        holder.highfirstText1.setText(highFirstProducts.get(position).getHighFirstText());
        holder.highfirstText2.setText(String.valueOf(highFirstProducts.get(position).getHighFirstSum()));

    }

    @Override
    public int getItemCount() {
        return highFirstProducts.size();
    }

    public static class HighFirstViewHolder extends RecyclerView.ViewHolder{

        ImageView highfirstImage;
        TextView highfirstText1, highfirstText2;

        public HighFirstViewHolder(@NonNull View itemView) {
            super(itemView);
            highfirstImage = itemView.findViewById(R.id.high_first_Image);
            highfirstText1 = itemView.findViewById(R.id.high_first_Text1);
            highfirstText2 = itemView.findViewById(R.id.high_first_Text2);
        }
    }


}
