package br.edu.fatec;

import br.edu.fatec.factory.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AreaCheckerApplicationTests {

	@Test
	void testSquare() {
		Square square = new Square(4.0);
		assertEquals(16.0, square.calculateArea(), "Square area calculation failed");
	}

	@Test
	void testRectangle() {
		Rectangle rectangle = new Rectangle(4.0, 5.0);
		assertEquals(20.0, rectangle.calculateArea(), "Rectangle area calculation failed");
	}

	@Test
	void testCircle() {
		Circle circle = new Circle(3.0);
		assertEquals(Math.PI * 3.0 * 3.0, circle.calculateArea(), "Circle area calculation failed");
	}

	@Test
	void testTriangle() {
		Triangle triangle = new Triangle(3.0, 4.0);
		assertEquals(0.5 * 3.0 * 4.0, triangle.calculateArea(), "Triangle area calculation failed");
	}

	@Test
	void testParallelogram() {
		Parallelogram parallelogram = new Parallelogram(4.0, 5.0);
		assertEquals(4.0 * 5.0, parallelogram.calculateArea(), "Parallelogram area calculation failed");
	}

	@Test
	void testTrapezium() {
		Trapezium trapezium = new Trapezium(3.0, 4.0, 5.0);
		assertEquals(0.5 * (3.0 + 4.0) * 5.0, trapezium.calculateArea(), "Trapezium area calculation failed");
	}

	@Test
	void testHexagon() {
		Hexagon hexagon = new Hexagon(2.0);
		assertEquals(((3 * Math.sqrt(3)) / 2) * 2.0 * 2.0, hexagon.calculateArea(), "Hexagon area calculation failed");
	}

	@Test
	void testRhombus() {
		Rhombus rhombus = new Rhombus(3.0, 4.0);
		assertEquals(0.5 * 3.0 * 4.0, rhombus.calculateArea(), "Rhombus area calculation failed");
	}
}