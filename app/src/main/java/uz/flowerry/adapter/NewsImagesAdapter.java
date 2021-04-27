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
import uz.flowerry.model.NewsImagesproduct;

public class NewsImagesAdapter extends RecyclerView.Adapter<NewsImagesAdapter.NewsImageViewHolder> {
   Context context;
   List<NewsImagesproduct> newsImages;

   public NewsImagesAdapter(Context context , List<NewsImagesproduct> newsImages) {
      this.context = context;
      this.newsImages = newsImages;
   }

   @NonNull
   @Override
   public NewsImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view = LayoutInflater.from(context).inflate(R.layout.news_recycler_item, parent, false );
      return new NewsImageViewHolder(view);
   }

   @Override
   public void onBindViewHolder(@NonNull NewsImageViewHolder holder, int position) {
      holder.newImage.setImageResource(newsImages.get(position).getImageNew());
      holder.newText2.setText(String.valueOf(newsImages.get(position).getNewTextPrice()));
      holder.newText1.setText(newsImages.get(position).getNewText());
      holder.itemView.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            Bundle bundle = new Bundle();
            bundle.putInt("news", newsImages.get(position).getImageNew());
            Navigation.findNavController(v).navigate(R.id.newsClickFragment2,bundle);
         }

      });

   }
   @Override
   public int getItemCount() {
      return newsImages.size();
   }


   public static class NewsImageViewHolder extends RecyclerView.ViewHolder{
      ImageView newImage;
      TextView newText1, newText2;

      public NewsImageViewHolder(@NonNull View itemView) {
         super(itemView);
         newImage = itemView.findViewById(R.id.newsImage);
         newText1 = itemView.findViewById(R.id.newsText_1);
         newText2 = itemView.findViewById(R.id.newsText_2);


      }
   }

}
