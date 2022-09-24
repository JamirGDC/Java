public class HcarHibrid extends HCar{
    String motorHibrid;

    public HcarHibrid(){
    }
    public HcarHibrid(String motorHibrid){
        this.motorHibrid = motorHibrid;
    }

    @Override
    public String toString() {
        return "HcarHibrid{" +
                "motorHibrid='" + motorHibrid + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
