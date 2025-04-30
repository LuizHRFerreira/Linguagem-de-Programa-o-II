package br.edu.fatec.main;

import br.edu.fatec.factory.Calculable;
import br.edu.fatec.factory.ShapeFactory;
import br.edu.fatec.factory.ShapeFactoryImpl;
import br.edu.fatec.factory.ShapeType;

public class AreaCheckerApplication {

	public static void main(String[] args) {

		ShapeFactoryImpl factory = new ShapeFactoryImpl();

		Calculable square = factory.getShape(ShapeType.Square, new Double[]{4.0});
		System.out.println("Área do quadrado: " + square.calculateArea());

	}

}
