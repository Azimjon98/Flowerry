package uz.flowerry.model;

public class NewsImagesproduct {

    private int ImageNew;
    private String NewText;
    private int NewTextPrice;

    public NewsImagesproduct(int imageNew, String newText, int newTextPrice) {
        ImageNew = imageNew;
        NewText = newText;
        NewTextPrice = newTextPrice;
    }


    public int getImageNew() {
        return ImageNew;
    }

    public void setImageNew(int imageNew) {
        ImageNew = imageNew;
    }

    public String getNewText() {
        return NewText;
    }

    public void setNewText(String newText) {
        NewText = newText;
    }

    public int getNewTextPrice() {
        return NewTextPrice;
    }

    public void setNewTextPrice(int newTextPrice) {
        NewTextPrice = newTextPrice;
    }
}
