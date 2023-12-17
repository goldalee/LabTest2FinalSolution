package labtest2;

public class FabricProperty{
    protected String fabricType;
    protected double fabricWeight;
    protected float fabricThickness;
    protected int fabricWidth;
    protected String fabricColour;

    public FabricProperty(){
        fabricType ="";
        fabricWeight=0;
        fabricThickness=0;
        fabricWidth=0;
        fabricColour ="";
    }

    public FabricProperty(String fabricType, double fabricWeight, float fabricThickness, int fabricWidth, String fabricColour){
        this.fabricType =fabricType;
        this.fabricWeight =fabricWeight;
        this.fabricThickness=fabricThickness;
        this.fabricWidth=fabricWidth;
        this.fabricColour =fabricColour;
    }

    public FabricProperty(FabricProperty fprop){
        fabricType =fprop.fabricType;
        fabricWeight=fprop.fabricWeight;
        fabricThickness=fprop.fabricThickness;
        fabricWidth=fprop.fabricWidth;
        fabricColour =fprop.fabricColour;
    }

    public String getFabricType() {
        return fabricType;
    }

    public void setFabricType(String fabricType) {
        this.fabricType = fabricType;
    }

    public double getFabricWeight() {
        return fabricWeight;
    }

    public void setFabricWeight(double fabricWeight) {
        this.fabricWeight = fabricWeight;
    }

    public float getFabricThickness() {
        return fabricThickness;
    }

    public void setFabricThickness(float fabricThickness) {
        this.fabricThickness = fabricThickness;
    }

    public int getFabricWidth() {
        return fabricWidth;
    }

    public void setFabricWidth(int fabricWidth) {
        this.fabricWidth = fabricWidth;
    }

    public String getFabricColour() {
        return fabricColour;
    }

    public void setFabricColour(String fabricColour) {
        this.fabricColour = fabricColour;
    }

    public void Show() {
        System.out.println("FabricProperty{" +
                "fabricType='" + fabricType + '\'' +
                ", fabricWeight=" + fabricWeight +
                ", fabricThickness=" + fabricThickness +
                ", fabricWidth=" + fabricWidth +
                ", fabricColour='" + fabricColour + '\'' +
                '}');
    }
}
