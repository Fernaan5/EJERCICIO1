package org.example;

import java.util.Scanner;

public class multiplicaciones_aules {
    private static Object numero2;

    static void main () {

     int numero = 221;
     String numero_string = Integer.toString(numero);
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





    }
}
