package br.edu.fatec.factory;

public class Cube {

    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side * 6;
    }
}
