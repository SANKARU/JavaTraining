package assignment;

import java.util.Scanner;

public class StudentGradeCalculator_Assignment {

	public static void main(String[] args) {
		// Write a program to find the grade of a Student based on total marks
//		Mark less than 40- Failed
//		40 to 60–Grade D
//		61 to 70-Grade C
//		71 to 80-Grade B
//		81 to 100-Grade A

		Scanner scanner = new Scanner(System.in);
		int marks = scanner.nextInt();

		if (marks >= 81 && marks <= 100) {
			System.out.println("The Student Received: 'Grade A'");
		} else if (marks >= 71 && marks <= 80) {
			System.out.println("The Student Received: 'Grade B'");

		} else if (marks >= 61 && marks <= 70) {
			System.out.println("The Student Received: 'Grade C'");
		} else if (marks >= 40 && marks <= 60) {
			System.out.println("The Student Received: 'Grade D'");
		} else if (marks >= 0 && marks <= 40) {
			System.out.println("The Student 'Failed'");
		} else {
			System.out.println("Enter a Valid Score the Exam is out of 100");
		}

	}

}
