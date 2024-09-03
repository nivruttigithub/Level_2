package obj_methodoverloading;

import java.util.Scanner;

public class Calculator {
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first num :");
		int num1 = sc.nextInt();
		System.out.println("Enter Second num :");
		int num2 = sc.nextInt();
		int addition = add(num1, num2);
		System.out.println("Addition Of " + num1 + " and " + num2 + " is : " + addition);
		sc.close();
	}

	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String args[]) {
		Calculator c1 = new Calculator();
		c1.input();
	}
}
