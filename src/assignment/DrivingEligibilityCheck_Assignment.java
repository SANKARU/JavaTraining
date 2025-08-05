package assignment;

import java.util.Scanner;

public class DrivingEligibilityCheck_Assignment {

	public static void main(String[] args) {
		//write a program to check whether the candidate is eligible for driving license
		
		Scanner scanner=new Scanner(System.in);
		int age=scanner.nextInt();
		
		if(age>=18) {
			System.out.println("The person is Eligible for driving License:");
		}else {
			System.out.println("The person is Not Eligible(X) for driving License:(Underaged)");
			
		}
		}

	}


