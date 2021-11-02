package Point;

public class PointTest {

	public static void main(String[] args) {
		
		Point object1 = new Point(10, 10);
		
		Point object2 = new Point(4, 3);
		
		System.out.println("Object1 to Origin");
		object1.calculateToOrigin();
		
		System.out.println("\n\nObject2 to origin");
		object2.calculateToOrigin();
		
		System.out.println("\n\nObject1 to Object2");
		object1.calculateToAnotherPoint(object2);
		
		System.out.println("\n\nClone Object1");
		System.out.println("Object1 ref: "+object1);
		Point object1Clone = object1.clone();
		System.out.println("Object1 clone ref: "+object1Clone);
		System.out.println("Object1 clone x: "+object1Clone.getX());
		System.out.println("Object1 clone y: "+object1Clone.getY());
		
		
		System.out.println("\n\nObject1 Clone Move");
		object1Clone.move(10, 5);
		System.out.println("Object1 clone x: "+object1Clone.getX());
		System.out.println("Object1 clone y: "+object1Clone.getY());
		
	}

}
