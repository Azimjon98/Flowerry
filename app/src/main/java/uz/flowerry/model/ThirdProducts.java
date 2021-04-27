package uz.flowerry.model;

public class ThirdProducts {
    private int thirdImage;
    private String thirdText;
    private int thirdTextSum;

    public ThirdProducts(int thirdImage, String thirdText, int thirdTextSum) {
        this.thirdImage = thirdImage;
        this.thirdText = thirdText;
        this.thirdTextSum = thirdTextSum;
    }

    public int getThirdImage() {
        return thirdImage;
    }

    public void setThirdImage(int thirdImage) {
        this.thirdImage = thirdImage;
    }

    public String getThirdText() {
        return thirdText;
    }

    public void setThirdText(String thirdText) {
        this.thirdText = thirdText;
    }

    public int getThirdTextSum() {
        return thirdTextSum;
    }

    public void setThirdTextSum(int thirdTextSum) {
        this.thirdTextSum = thirdTextSum;
    }
}
