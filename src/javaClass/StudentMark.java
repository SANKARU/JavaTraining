package javaClass;

import java.util.Scanner;

public class StudentMark {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int mark = scanner.nextInt();
		// int mark=71;
		if (mark > 80) {

			System.out.println("Grade of Student is: A+");
		} else if (mark > 70) {
			System.out.println("Grade of Student is: B+");
		} else if (mark > 60) {
			System.out.println("Grade of Student is: C+");
		}

		else {

			System.out.println("Student is Failed");
		}

	}

}
