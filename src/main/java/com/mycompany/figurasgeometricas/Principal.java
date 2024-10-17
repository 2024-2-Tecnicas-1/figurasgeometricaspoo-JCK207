package com.mycompany.figurasgeometricas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // TODO: Tu código va aquí
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre de la figura: ");
        String nombre = sc.next();
        System.out.print("Ingrese el color de la figura: ");
        String color = sc.next();
        
        System.out.println();
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo (rectángulo)");
        System.out.println();
        
        FiguraGeometrica figura = new FiguraGeometrica(null, null);
        int opcion;
        do {
            System.out.print("Ingrese el tipo de figura: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = sc.nextDouble();
                    figura = new Circulo(radio, nombre, color);
                }
                case 2 -> {
                    System.out.print("Ingrese el lado 1 del rectángulo: ");
                    double lado1 = sc.nextDouble();
                    System.out.print("Ingrese el lado 2 del rectángulo: ");
                    double lado2 = sc.nextDouble();
                    figura = new Rectangulo(lado1, lado2, nombre, color);
                }
                case 3 -> {
                    System.out.print("Ingrese la base del triángulo: ");
                    double base = sc.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = sc.nextDouble();
                    figura = new Triangulo(base, altura, nombre, color);
                }
            }
        } while (opcion<1 || opcion>3);
        
        System.out.println();
        System.out.printf("Área: %.2f\n",figura.obtenerArea());
        System.out.printf("Perímetro: %.2f\n",figura.obtenerPerimetro());
    }
}
