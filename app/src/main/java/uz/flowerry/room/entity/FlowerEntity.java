package uz.flowerry.room.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "flowers_table")
public class FlowerEntity {
    @PrimaryKey(autoGenerate = true)
    int id;
    String image;
    String title;
    int count;
    Double price;

    public FlowerEntity() {
    }

    public FlowerEntity(int id, String image, String title, int count, Double price) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.count = count;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
