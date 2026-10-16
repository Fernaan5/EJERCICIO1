package org.example;

import java.util.Scanner;

public class Ejerccio1 {

static void main() {

    Scanner teclado = new Scanner(System.in);

    System.out.println("¿Como te llamas?");
    String nombre = teclado.next();

    teclado.nextLine();

    System.out.println("A que curso vas:");
    String curso = teclado.nextLine();

    System.out.println(" hola " + " bienvenido a " + curso);

    System.out.println("Inserta un munero...");
    int num1 = teclado.nextInt();
    System.out.println("Inserta otro munero...");
    int num2 = teclado.nextInt();

    //concatenando
    System.out.println("El resultado es" + (num1+num2));

    //variable resultado
    int resultado = num1+num2;
    System.out.println("El resultado es" + resultado);

}}
