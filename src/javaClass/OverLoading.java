package javaClass;

public class OverLoading {

	public static void number(int a, int b) {
		int sum = a + b;
		System.out.println("The sum is="+" "+sum);

	}

	public static void numbet(int a,int b,int c) {
		int sum = a + b+c;
		System.out.println("The sum is="+" "+sum);
		
	}
	public static void main(String[] args) {
		OverLoading.number(2, 5);
		OverLoading.numbet(1, 2, 3);
		
	}

}
