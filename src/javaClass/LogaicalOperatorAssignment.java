package javaClass;

import java.util.Scanner;

public final class LogaicalOperatorAssignment {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if (age > 18 && age < 32) {

			System.out.println("Student is Eligible for consultation");
		}

		else if (age>=17 && age<18) {
			System.out.println("Student is Not Eligible for consultation");
			}
			else {
				System.out.println("Enter a valid age:");
			}
		}
	}


