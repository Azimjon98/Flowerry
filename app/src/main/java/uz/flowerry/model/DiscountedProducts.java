package uz.flowerry.model;

public class DiscountedProducts {

   private Integer id;
   private int ImageUrl;

    public DiscountedProducts(Integer id, int imageUrl) {
        this.id = id;
        ImageUrl = ImageUrl;
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
}
