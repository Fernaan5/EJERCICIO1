package org.example;

import java.util.Scanner;

public class Eercicio_feria {
    static void main () {

        Scanner teclado = new Scanner(System.in);

        System.out.println("BIENVENIDO AL RATÓN JUGUETÓN");

        System.out.println("introduzca su altura en cm");
        int altura = teclado.nextInt();
        if (altura < 140 && altura >=0) {
            System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN. Te faltan " + (140 - altura) + "cm de altura");
        } else {

                if (altura < 0 || altura > 230) {
                    System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR");
                }else{

                teclado.nextLine();
                System.out.println("introduce tu peso");
                float peso = teclado.nextFloat();
                float peso_minimo = altura * 2 / 8;


                if (peso < peso_minimo) {
                    System.out.println(" Lo siento, te faltan " + (peso_minimo - peso) + "kilos para subir");
                }else{


                    if (peso > 120) {
                        System.out.println(" Lo siento, te sobran " + (peso - 120) + "kilos para subir");



                    }else{
                        System.out.println("Puedes subir");
                    }


                }


            }


        }
    }}
