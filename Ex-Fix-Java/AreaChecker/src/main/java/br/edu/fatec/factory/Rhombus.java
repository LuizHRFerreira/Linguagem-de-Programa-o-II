package br.edu.fatec.factory;

public class Rhombus implements Calculable{

    private double base;
    private double height;

    public Rhombus(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height)/2;
    }

}
