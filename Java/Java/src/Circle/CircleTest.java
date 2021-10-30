package Circle;

public class CircleTest {

	public static void main(String[] args) {
		
		Circle object = new Circle();
		object.r = 3;
		System.out.println(object.calculateArea());
		System.out.println(object.calculatePerimeter());
	}

}
