package org.example;

import java.util.Scanner;

public class Ejercicio7_Aules {
    static void main(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce si hay aceite [S/N]");
        char aceite = teclado.next().charAt(0);

        System.out.println("Introduce si hay tomate [S/N]");
        char tomate = teclado.next().charAt(0);

        System.out.println("Introduce si hay jamon [S/N]");
        char jamon = teclado.next().charAt(0);

        if (aceite== 'N' || tomate== 'N' || jamon== 'N') {
            System.out.println("Comprar!!");
        }else{
            System.out.println("No comprar!!");
        }
    }
}