package labtest2;

public class Velvet extends FabricProperty{
    private double yarnPercentage;
    private String velvetType;


    //default constructor
    public Velvet (){

        yarnPercentage =0.0;
        velvetType ="";
    }

    //primary constructor
    public Velvet(String fabricType,double fabricWeight, float fabricThickness, int fabricWidth, String fabricColour, double yarnPercentage, String velvelType){
        super(fabricType,fabricWeight, fabricThickness, fabricWidth, fabricColour);
        this.yarnPercentage = yarnPercentage;
        this.velvetType = velvelType;
    }

    //copy constructor
    public Velvet(Velvet vlv){
        super(vlv.fabricType,vlv.fabricWeight, vlv.fabricThickness, vlv.fabricWidth, vlv.fabricColour);
        yarnPercentage = vlv.yarnPercentage;
        velvetType = vlv.velvetType;
    }

    public double getYarnPercentage() {
        return yarnPercentage;
    }

    public void setYarnPercentage(double yarnPercentage) {
        this.yarnPercentage = yarnPercentage;
    }

    public String getVelvetType() {
        return velvetType;
    }

    public void setVelvetType(String velvetType) {
        this.velvetType = velvetType;
    }


    public void Display() {
        System.out.println("Velvet{" +
                "yarnPercentage=" + yarnPercentage +
                ", velvetType='" + velvetType + '\'' +
                ", fabricType='" + fabricType + '\'' +
                ", fabricWeight=" + fabricWeight +
                ", fabricThickness=" + fabricThickness +
                ", fabricWidth=" + fabricWidth +
                ", fabricColour='" + fabricColour + '\'' +
                '}');
    }
}