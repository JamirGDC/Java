public class AFunciones {
    public static void main(String[] args) {

        System.out.println("hola gente");
        holamundo();
        holamundo("Alan");
        holamundo("Roberto");
            String hola = devolverhola();
            System.out.println(hola);
        holamundo("Pedro ", "Carrión ", "asdf");
    }

    public static void holamundo() {
        System.out.println("hola gente desde un metodo");
    }
    private static void holamundo(String name) {
        System.out.println("hola " + name);
    }

    private static String devolverhola() {
        return "hola";
    }

    private static void holamundo(String name, String surname, String Apellido) {
        System.out.println("hola " + name + surname  + Apellido);
    }
}
