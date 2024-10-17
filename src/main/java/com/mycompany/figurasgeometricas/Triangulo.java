package com.mycompany.figurasgeometricas;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura, String nombre, String color) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }
    
    public double obtenerArea() {
        return base*altura/2;
    }
    
    public double obtenerPerimetro() {
        return base + altura + Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
    }
}
