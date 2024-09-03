package obj_methodoverloading;

import java.util.Scanner;

public class CuboidCalculator {
	double length;
	double breadth;
	double height;

	public CuboidCalculator(double length, double breadth, double height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	public double perimeter() {
		return 2 * (length + breadth);
	}

	public double area() {
		double baseArea = length * breadth;
		double basePerimeter = perimeter();
		System.out.println("Perimeter Of Base : " + basePerimeter);
		return baseArea;
	}

	public double volume() {
		double baseArea = area();
		System.out.println("Area Of Volume is : " + baseArea);
		return baseArea * height;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length : ");
		double length = sc.nextDouble();
		System.out.println("Enter Breadth : ");
		double breadth = sc.nextDouble();
		System.out.println("Enter Height : ");
		double height = sc.nextDouble();

		CuboidCalculator c1 = new CuboidCalculator(length, breadth, height);
		double volume = c1.volume();
		System.out.println("Volume Of the Cuboid is : " + volume);
		sc.close();
	}

}
