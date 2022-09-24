/*
-tipo identificador = 30
-tipo identificador;
-identificador = 30;

*enteros
-byte number1 = 1 // 1 byte
-short number2 = 2 // 2 byte
-int number3 = 3 // 4 byte
-long number4 = 4L // 8 byte

*punto flotante
-float decimal = 4.9f;
-double decimal = 9.99d;

*caracter
-char caracter1 = 'a';
-varchar caracter2 = 'b';

*boleanos
-boolean boolean1 = true;
-boolean boolean2 = false;

*cadenas de texto
-string nombre = "alan";
-string apellido = "Sastre"

*Envoltorio
-Integer numero = null;
-Long numero2 = 2L;

**Operadores
**Aritmeticos
    + - / * %
**Logicos
<, >, <=, >=, ==, !=, && and, || or, !true
**Asignacion
=, +=, -=, /=, *=, %=
**Incremento
++, --,
**Concatenación
+

 */
public class AATipos {
    public static void main(String[] args) {
        int num_1 = 1;
        int num_2 = 2;
        int resultado = 0;

        resultado = num_1 + num_2;
        System.out.println("el resultado es " + resultado);

    }
}
