public class HCocheMain {
    public static void main(String[] args) {

        String coche = "alfa romeo";
        HCar cocheObj = new HCar();

        HCar cocheObj2 = new HCar("blanco", "audi", "a3",1500.6,4.4);

        cocheObj2.acelerar(50);

        System.out.println(cocheObj2);

        cocheObj2.peso = 1340.5;

        System.out.println(cocheObj2);

        HcarElectrico cocheelectrico = new HcarElectrico();
        cocheelectrico.motorelectrico = "";
        cocheelectrico.color = "negro";
        cocheelectrico.fabricante = "bmw";
        cocheelectrico.modelo = "x1";

        System.out.println(cocheelectrico);
    }
}
