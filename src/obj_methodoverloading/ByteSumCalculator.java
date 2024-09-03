package obj_methodoverloading;

import java.util.Scanner;

public class ByteSumCalculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Byte Value : ");
		byte byteValue1 = sc.nextByte();
		System.out.println("Enter Second Byte Value : ");
		byte byteValue2 = sc.nextByte();

		int intValue1 = (int) byteValue1;
		int intValue2 = (int) byteValue2;

		int sum = intValue1 + intValue2;
		System.out.println("Addition Of two byte Value is : " + sum);
		sc.close();
	}
}
