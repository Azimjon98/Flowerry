package uz.flowerry.model;

public class FourthProducts {
    private int fourthImage;
    private String fourthText;
    private int fourthSum;

    public FourthProducts(int fourthImage, String fourthText, int fourthSum) {
        this.fourthImage = fourthImage;
        this.fourthText = fourthText;
        this.fourthSum = fourthSum;
    }

    public int getFourthImage() {
        return fourthImage;
    }

    public void setFourthImage(int fourthImage) {
        this.fourthImage = fourthImage;
    }

    public String getFourthText() {
        return fourthText;
    }

    public void setFourthText(String fourthText) {
        this.fourthText = fourthText;
    }

    public int getFourthSum() {
        return fourthSum;
    }

    public void setFourthSum(int fourthSum) {
        this.fourthSum = fourthSum;
    }
}
