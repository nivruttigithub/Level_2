package obj_methodoverloading;

public class ArithmeticSum {
	public int sum(int a, int b) {
		return a + b;
	}

	public int sum(int a, int b, int c) {
		return a + b + c;
	}

	public int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	public static void main(String args[]) {
		ArithmeticSum obj = new ArithmeticSum();
		int sum2 = obj.sum(2, 5);
		System.out.println("Sum Of Two Number : " + sum2);
		int sum3 = obj.sum(10, 20, 30);
		System.out.println("Sum Of Three Number : " + sum3);
		int sum4 = obj.sum(100, 200, 300, 500);
		System.out.println("Sum Of Four Number is : " + sum4);
	}

}
