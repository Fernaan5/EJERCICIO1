package org.example;

import java.util.Scanner;

public class Ejercicio1_Aules {

    static void main() {
        System.out.println("Introduce numero de horas");
        Scanner teclado = new Scanner(System.in);
        double horas = teclado.nextFloat();

        System.out.println("Precio/hora");
        double tarifa = teclado.nextFloat();

        if (horas <= 40) {
            double salario = horas * tarifa;
            System.out.println("Salario" + salario);
        } else {
            double extras = horas - 40;
            double salario = 40 * tarifa;
            extras = extras * tarifa * 1.5;
            System.out.println("Salario (con extras)" + (salario + extras));
        }

    }


}

