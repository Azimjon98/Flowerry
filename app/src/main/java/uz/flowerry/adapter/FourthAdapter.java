package uz.flowerry.adapter;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import uz.flowerry.R;
import uz.flowerry.model.FourthProducts;

public class FourthAdapter extends RecyclerView.Adapter<FourthAdapter.FourthViewHolder> {
    Context context;
    List<FourthProducts> fourthProducts;

    public FourthAdapter(Context context, List<FourthProducts> fourthProducts) {
        this.context = context;
        this.fourthProducts = fourthProducts;
    }

    @NonNull
    @Override
    public FourthViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.fourth_recycler_item, parent,false);
        return new FourthViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FourthViewHolder holder, int position) {
        holder.fourthImage.setImageResource(fourthProducts.get(position).getFourthImage());
        holder.fourthText1.setText(fourthProducts.get(position).getFourthText());
        holder.fourthText2.setText(String.valueOf(fourthProducts.get(position).getFourthSum()));

    }

    @Override
    public int getItemCount() {
        return fourthProducts.size();
    }

    public static class FourthViewHolder extends RecyclerView.ViewHolder{
        ImageView fourthImage;
        TextView fourthText1, fourthText2;

        public FourthViewHolder(@NonNull View itemView) {
            super(itemView);
            fourthImage = itemView.findViewById(R.id.fourth_Image);
            fourthText1 = itemView.findViewById(R.id.fourth_Text1);
            fourthText2 = itemView.findViewById(R.id.fourth_Text2);
        }
    }
}
