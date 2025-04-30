package br.edu.fatec.factory;

public class ShapeFactoryImpl implements ShapeFactory {

    public Calculable getShape(ShapeType type, Double[] values) {

        switch (type) {
            case Square:
                return new Square(values[0]);
            case Rectangle:
                return new Rectangle(values[0], values[1]);
            case Círcle:
                return new Circle(values[0]);
            case Triangle:
                return new Triangle(values[0], values[1]);
            case Parallelogram:
                return new Parallelogram(values[0], values[1]);
            case Trapezium:
                return new Trapezium(values[0], values[1], values[2]);
            case Hexagon:
                return new Hexagon(values[0]);
            case Rhombus:
                return new Rhombus(values[0], values[1]);
            default:
                throw new IllegalArgumentException("Tipo de forma desconhecido: " + type);
        }
    };
}
