package br.edu.fatec.factory;

public class Square implements getSquare {

    private double side;

    @Override
    public double getSide(double side) {
        this.side = side;
        return side;
    }
}
