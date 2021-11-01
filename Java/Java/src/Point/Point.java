package Point;

public class Point {
	private int x;
	private int y;

	void calculateToOrigin() {
		double result = Math.sqrt((x * x + y * y));
		System.out.println(result);
	}

	void calculateToAnotherPoint(Point point) {
		int anotherX = point.getX();
		int anotherY = point.getY();
		int differenceOfX = x - anotherX;
		int differenceOfY = y - anotherY;
		double result = Math.sqrt((differenceOfX * differenceOfX) + (differenceOfY * differenceOfY));
		System.out.println(result);
	}
	
	protected Point clone() {
		Point newPoint = new Point();
		newPoint.setX(x);
		newPoint.setY(y);
		
		return newPoint;
	}
	
	void move(int moveX, int moveY) {
		x += moveX;
		y += moveY;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
