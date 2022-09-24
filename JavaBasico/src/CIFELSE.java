public class CIFELSE {
    public static void main(String[] args) {
        boolean check = 5 < 10;

        int num_1=5;
        int num_2=10;
        int num_3=30;
        int num_4=400;


        if (check) {
            System.out.println("verdadero");
        }else {
            System.out.println("falso");
        }

        if (num_1 < num_2 && num_2 < num_3) {
            System.out.println(true);
        } else if (num_1 < num_4) {
            System.out.println("NICE");

        } else {
            System.out.println(false);
        }
        System.out.println("FIN");
    }
}
