package assignment;

import java.util.Scanner;

public class Vowels_Assignment {

	public static void main(String[] args) {

		Scanner scannner = new Scanner(System.in);
		System.out.println("Enter a character");
		char v = scannner.next().charAt(0);

		switch (v) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonent");

		}

	}

}
