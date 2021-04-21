package uz.flowerry.model;

import android.widget.TextView;

public class DiscountedProducts {


     String text;
   Integer id;
   int ImageUrl;

    public DiscountedProducts(Integer id, int imageUrl, String title) {
        this.id = id;
        this.ImageUrl = imageUrl;
        this.text = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(int imageUrl) {
        ImageUrl = imageUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
