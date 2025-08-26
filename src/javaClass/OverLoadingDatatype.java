package javaClass;

public class OverLoadingDatatype {

	public static void number(int a, int b) {

		int sum = a + b;
		System.out.println(sum);

	}

	
	public static void number(double a, int b) {
		
		double sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {

		OverLoadingDatatype.number(2, 2);
		OverLoadingDatatype.number(4.5, 6);
		
	}

}
