package uz.flowerry.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import uz.flowerry.R;
import uz.flowerry.room.entity.FlowerEntity;

public class FragmentCartAdapter extends RecyclerView.Adapter<FragmentCartAdapter. FagmentCartViewHolder> {

    Context context;
    public List<FlowerEntity> fragmentCartItems = new ArrayList<>();

    public FragmentCartAdapter(Context context, List<FlowerEntity> fragmentCartItems) {
        this.context = context;
        this.fragmentCartItems = fragmentCartItems;
    }

    @NonNull
    @Override
    public FagmentCartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(context).inflate(R.layout.fragment_cart, parent, false);
        return new FagmentCartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FagmentCartViewHolder holder, int position) {
        holder.fragmentvalue.setText(String.valueOf(fragmentCartItems.get(position).getCount()));

    }

    @Override
    public int getItemCount() {
        return fragmentCartItems.size();
    }

    public static class FagmentCartViewHolder extends RecyclerView.ViewHolder{
        ImageView fragmentcartimage, fragmentminus, fragmentplus;
        TextView fragmentcarttext, fragmentvalue, fragmentcartprice;


        public FagmentCartViewHolder(@NonNull View itemView) {
            super(itemView);
            fragmentcartimage = itemView.findViewById(R.id.fragment_cart_image);
            fragmentcarttext = itemView.findViewById(R.id.fragment_cart_text);
            fragmentvalue = itemView.findViewById(R.id.value);
            fragmentminus = itemView.findViewById(R.id.minus);
            fragmentplus = itemView.findViewById(R.id.plus);
            fragmentcartprice = itemView.findViewById(R.id.fragment_cart_price);

        }
    }
}
