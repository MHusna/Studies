package Circle;

public class Circle {

	double r;
	final double pi = 3.14;

	double calculateArea() {
		return pi * r * r;
	}
	
	double calculatePerimeter() {
		return 2*pi*r;
	}
}
