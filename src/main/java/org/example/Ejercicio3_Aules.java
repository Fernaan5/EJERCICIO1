package org.example;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Ejercicio3_Aules {

    static void main(){
        System.out.println("Dime un numero");
        Scanner teclado = new Scanner(System.in);

    int numero = teclado.nextInt();

    if (numero > 0) {
        System.out.println("numero positivo");
    }else if (numero < 0){;
        System.out.println("numero negativo");
    }else{
            System.out.println("numero neutro");
    }
    }
}
