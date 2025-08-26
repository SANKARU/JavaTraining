package assignment;

import java.util.Scanner;

public class Calculator_Assignment {
//	static int a = 2, b = 4;

	public static void addition(int a, int b) {

		int add = a + b;
		System.out.println(add);

	}

	public static void subtraction(int a, int b) {

		int Sub = a - b;
		System.out.println(Sub);
	}

	public static void multiplication(int a, int b) {
		int Mul = a * b;
		System.out.println(Mul);
	}

	public static void division(double a, double b) {
		double div = a / b;
		System.out.println(div);
	}

	public static void main(String[] args) {

		Calculator_Assignment.addition(2, 3);
		Calculator_Assignment.subtraction(2, 2);
		Calculator_Assignment.multiplication(2, 2);
		Calculator_Assignment.division(2, 2);

	}

}
