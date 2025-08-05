package assignment;

import java.util.Scanner;

public class CheckPositiveNumber_Assignment {

	public static void main(String[] args) {
		// write a program to check the number is +ve

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		if (num >= 0) {
			System.out.println("The number is Positive:");
		} else {
			System.out.println("The number is Negative:");
		}
	}

}
