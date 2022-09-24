public class FContinueBreak {
    public static void main(String[] args) {
    //continue salta el valor 6 y continua
        int count = 0;

        while (count < 10) {
            count++;
            if (count == 6)
                continue;
            System.out.println(count +  " hola mundo");
        }


        System.out.println("break: ");
        //rompe el flujo de ejecucion.

        int num_2 = 0;

        while (num_2 < 10){
            num_2++;
            if (num_2 == 6)
                break;
            System.out.println(num_2 +  " hola mundo");
        }

        System.out.println(" con FoR");

        for (int i = 1; i < 10; i++){
            if (i == 6 )
                continue;
            System.out.println(i +  " hola mundo");
        }
    }
}
