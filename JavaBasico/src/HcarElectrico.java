public class HcarElectrico extends HCar{

    String motorelectrico;

    public HcarElectrico(){
    }

    public HcarElectrico(String motorelectrico){
        this.motorelectrico = motorelectrico;
    }

    @Override
    public String toString() {
        return "HcarElectrico{" +
                "motorelectrico='" + motorelectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
