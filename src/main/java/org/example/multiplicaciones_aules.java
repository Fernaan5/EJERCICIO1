package org.example;

import java.util.Scanner;

public class multiplicaciones_aules {
    private static Object numero2;

    static void main () {

        Scanner teclado = new Scanner(System.in);

        System.out.println("INTRODUCE UN NUMERO");
        int numero = teclado.nextInt();

        System.out.println("INTRODUCE OTRO NUMERO");

     int numero1 = teclado.nextInt();
     String numero_string = Integer.toString(numero1);
     System.out.println(numero_string);

     String primera_cifra = numero_string.substring(2,3);
     int primera_cifra_numero = Integer.parseInt(primera_cifra);
     System.out.println(primera_cifra_numero);

     String segunda_cifra = numero_string.substring(1,2);
     int segunda_cifra_numero = Integer.parseInt(segunda_cifra);
     System.out.println(segunda_cifra_numero);

     String tercera_cifra = numero_string.substring(0,1);
     int tercera_cifra_numero = Integer.parseInt(tercera_cifra);
     System.out.println(tercera_cifra_numero);

        System.out.println("El producto de la multiplicacion es" + (numero*numero1));
        System.out.println("El proceso es");

        System.out.println(" "+numero);
        System.out.println("*"+numero1);
        System.out.println("-------");

        System.out.println("  "+(primera_cifra_numero*numero));
        System.out.println(" "+(segunda_cifra_numero*numero)+"X");
        System.out.println((tercera_cifra_numero*numero)+"XX");

        System.out.println("-------");
        System.out.println((numero*numero1));















    }
}
