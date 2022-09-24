public class Gswitch {
    public static void main(String[] args) {
        String weather = "sunny";

        switch (weather) {
            case "sunny":
                System.out.println(" el tiempo es sunny");
                break;

            case "cloudy":
                System.out.println("el tiempo es cloudy");
                break;

            default:
                System.out.println("no se ha podido identificar el clima");

        }
    }
}
