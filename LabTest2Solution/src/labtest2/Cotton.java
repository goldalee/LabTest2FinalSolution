package labtest2;

public class Cotton extends FabricProperty{
    private double fiberDiameter;
    private boolean elasticRecovery;
    private float cottonPercentage;

    //default constructor
    public Cotton(){
        fiberDiameter = 0.0;
        elasticRecovery =true;
        cottonPercentage =0;
    }

    //primary constructor
    public Cotton(String fabricType,double fabricWeight, float fabricThickness, int fabricWidth, String fabricColour, double fiberDiameter, boolean elasticRecovery, float cottonPercentage){
        super(fabricType,fabricWeight, fabricThickness, fabricWidth, fabricColour);
        this.fiberDiameter = fiberDiameter;
        this.cottonPercentage=cottonPercentage;
        this.elasticRecovery=elasticRecovery;
    }

    //copy constructor
    public Cotton(Cotton cttn){
        super(cttn.fabricType,cttn.fabricWeight, cttn.fabricThickness, cttn.fabricWidth, cttn.fabricColour);
        fiberDiameter = cttn.fiberDiameter;
        cottonPercentage = cttn.cottonPercentage;
        elasticRecovery = cttn.elasticRecovery;
    }

    public double getFiberDiameter() {
        return fiberDiameter;
    }

    public void setFiberDiameter(double fiberDiameter) {
        this.fiberDiameter = fiberDiameter;
    }

    public boolean isElasticRecovery() {
        return elasticRecovery;
    }

    public void setElasticRecovery(boolean elasticRecovery) {
        this.elasticRecovery = elasticRecovery;
    }

    public float getCottonPercentage() {
        return cottonPercentage;
    }

    public void setCottonPercentage(float cottonPercentage) {
        this.cottonPercentage = cottonPercentage;
    }

    public void Display() {
        System.out.println("Cotton{" +
                "fiberDiameter=" + fiberDiameter +
                ", elasticRecovery=" + elasticRecovery +
                ", cottonPercentage=" + cottonPercentage +
                ", fabricType='" + fabricType + '\'' +
                ", fabricWeight=" + fabricWeight +
                ", fabricThickness=" + fabricThickness +
                ", fabricWidth=" + fabricWidth +
                ", fabricColour='" + fabricColour + '\'' +
                '}');
    }


}