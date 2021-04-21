package uz.flowerry.model;

public class RecomendedProdects {

    private int recomendImage;
    private String recomendText;
    private int recomendTextSum;

    public RecomendedProdects(int recomendImage, String recomendText, int recomendTextSum) {
        this.recomendImage = recomendImage;
        this.recomendText = recomendText;
        this.recomendTextSum = recomendTextSum;
    }

    public int getRecomendImage() {
        return recomendImage;
    }

    public void setRecomendImage(int recomendImage) {
        this.recomendImage = recomendImage;
    }

    public String getRecomendText() {
        return recomendText;
    }

    public void setRecomendText(String recomendText) {
        this.recomendText = recomendText;
    }

    public int getRecomendTextSum() {
        return recomendTextSum;
    }

    public void setRecomendTextSum(int recomendTextSum) {
        this.recomendTextSum = recomendTextSum;
    }
}