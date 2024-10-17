package com.mycompany.figurasgeometricas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // TODO: Tu c�digo va aqu�
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre de la figura: ");
        String nombre = sc.next();
        System.out.print("Ingrese el color de la figura: ");
        String color = sc.next();
        
        System.out.println();
        System.out.println("1. C�rculo");
        System.out.println("2. Rect�ngulo");
        System.out.println("3. Tri�ngulo (rect�ngulo)");
        System.out.println();
        
        FiguraGeometrica figura = new FiguraGeometrica(null, null);
        int opcion;
        do {
            System.out.print("Ingrese el tipo de figura: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el radio del c�rculo: ");
                    double radio = sc.nextDouble();
                    figura = new Circulo(radio, nombre, color);
                }
                case 2 -> {
                    System.out.print("Ingrese el lado 1 del rect�ngulo: ");
                    double lado1 = sc.nextDouble();
                    System.out.print("Ingrese el lado 2 del rect�ngulo: ");
                    double lado2 = sc.nextDouble();
                    figura = new Rectangulo(lado1, lado2, nombre, color);
                }
                case 3 -> {
                    System.out.print("Ingrese la base del tri�ngulo: ");
                    double base = sc.nextDouble();
                    System.out.print("Ingrese la altura del tri�ngulo: ");
                    double altura = sc.nextDouble();
                    figura = new Triangulo(base, altura, nombre, color);
                }
            }
        } while (opcion<1 || opcion>3);
        
        System.out.println();
        System.out.printf("�rea: %.2f\n",figura.obtenerArea());
        System.out.printf("Per�metro: %.2f\n",figura.obtenerPerimetro());
    }
}
