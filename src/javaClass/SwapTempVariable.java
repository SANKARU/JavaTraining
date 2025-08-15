package javaClass;

public class SwapTempVariable {

	public static void main(String[] args) {

		int a = 2, b = 4;

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println(a+","+b);

	}

}
