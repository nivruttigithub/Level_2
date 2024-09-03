package obj_methodoverloading;

public class AreaMethodOverloading {

	public double calculateArea(double side)
	{
		return side*side;
	}
	public double calculateArea(double length, double breadth)
	{
		return length*breadth;
	}
	public double calculateArea(double radius , boolean isCircle)
	{
		if(isCircle)
		{
			return 3.14*radius*radius;
		}
		return 0;
	}
	public static void main(String args[])
	{
		AreaMethodOverloading obj = new AreaMethodOverloading();
		double squareArea = obj.calculateArea(5);
		System.out.println("Area Of Square is : "+squareArea);
		double rectArea = obj.calculateArea(5,9);
		System.out.println("Area Of Rectangle is :"+rectArea);
		double circleArea = obj.calculateArea(2,true);
		System.out.println("Area Of Circle : "+circleArea);
	}
}
