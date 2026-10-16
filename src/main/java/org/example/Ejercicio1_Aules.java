package org.example;

import java.util.Scanner;

public class Ejercicio1_Aules {

    static void main(){
        System.out.println("¿Que numero de horas trabajas?");
        Scanner teclado = new Scanner(System.in);
        float horas = teclado.nextFloat();

        System.out.println("¿Que tarifa cobras por hora?");
        float tarifa = teclado.nextFloat();

        System.out.println("salario:" + (horas*tarifa));



        }

}
