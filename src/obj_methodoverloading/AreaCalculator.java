package obj_methodoverloading;

class Rectangle {
	int length;
	int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public double calculateArea() {
		return length * breadth;
	}
}

class Triangle {
	int length;
	int breadth;

	public Triangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public double calculateArea() {
		return 0.5 * length * breadth;
	}
}

public class AreaCalculator {

	public static double getRectangleArea(Rectangle rectangle) {
		return rectangle.calculateArea();
	}

	public static double getTriangleArea(Triangle triangle) {
		return triangle.calculateArea();
	}

	public static void main(String args[]) {
		Rectangle rect = new Rectangle(5, 6);
		Triangle tri = new Triangle(2, 3);
		double rectArea = getRectangleArea(rect);
		double triArea = getTriangleArea(tri);

		System.out.println("Area Of Rectangle is : " + rectArea);
		System.out.println("Area Of Triangle is : " + triArea);
	}
}
