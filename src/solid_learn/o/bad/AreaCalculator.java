package solid_learn.o.bad;

import java.awt.*;

public class AreaCalculator {
	public double calculate(Object[] shapes) {
		double totalArea = 0;
		for (Object shape : shapes) {
			if (shape instanceof Rectangle) {
				Rectangle rectangle = (Rectangle)shape;
				totalArea += rectangle.getWidth() * rectangle.getHeight();
			} else if (shape instanceof Circle) {
				Circle circle = (Circle)shape;
				totalArea += 3.14 * circle.getRadius() * circle.getRadius();
			}
		}
		return totalArea;
	}
}