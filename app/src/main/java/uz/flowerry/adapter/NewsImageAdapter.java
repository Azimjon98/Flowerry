package uz.flowerry.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import uz.flowerry.R;
import uz.flowerry.model.NewsImagesproduct;

public class NewsImageAdapter extends RecyclerView.Adapter<NewsImageAdapter.NewsImageViewHolder> {
   Context context;
   List<NewsImagesproduct> newsImages;

   public NewsImageAdapter(Context context , List<NewsImagesproduct> newsImages) {
      this.context = context;
      this.newsImages = newsImages;
   }

   @NonNull
   @Override
   public NewsImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view = LayoutInflater.from(context).inflate(R.layout.image_element, parent, false );
      return new NewsImageViewHolder(view);
   }

   @Override
   public void onBindViewHolder(@NonNull NewsImageViewHolder holder, int position) {
      holder.newImage.setImageResource(newsImages.get(position).getImageNew());

   }

   @Override
   public int getItemCount() {
      return newsImages.size();
   }


   public static class NewsImageViewHolder extends RecyclerView.ViewHolder{
      ImageView newImage;

      public NewsImageViewHolder(@NonNull View itemView) {
         super(itemView);
         newImage = itemView.findViewById(R.id.news_image);
      }
   }

}
