package br.edu.fatec.factory;

public class Trapezium implements Calculable{

    private double biggestBase;
    private double smallestBase;
    private double height;

    public Trapezium(double biggestBase, double smallestBase, double height) {
        this.biggestBase = biggestBase;
        this.smallestBase = smallestBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((biggestBase + smallestBase) * height) / 2;
    }

}
