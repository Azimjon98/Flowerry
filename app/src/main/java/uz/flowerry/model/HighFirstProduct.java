package uz.flowerry.model;

public class HighFirstProduct {
    private int HighFirstImage;
    private String HighFirstText;
    private int HighFirstSum;

    public HighFirstProduct(int highFirstImage, String highFirstText, int highFirstSum) {
        HighFirstImage = highFirstImage;
        HighFirstText = highFirstText;
        HighFirstSum = highFirstSum;
    }

    public int getHighFirstImage() {
        return HighFirstImage;
    }

    public void setHighFirstImage(int highFirstImage) {
        HighFirstImage = highFirstImage;
    }

    public String getHighFirstText() {
        return HighFirstText;
    }

    public void setHighFirstText(String highFirstText) {
        HighFirstText = highFirstText;
    }

    public int getHighFirstSum() {
        return HighFirstSum;
    }

    public void setHighFirstSum(int highFirstSum) {
        HighFirstSum = highFirstSum;
    }
}
