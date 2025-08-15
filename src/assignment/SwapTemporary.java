package assignment;

public class SwapTemporary {

	public static void main(String[] args) {

		int a = 2, b = 3, c;

		System.out.println("Before swapping="+" "+a + " ," + b);

		c = a;
		a = b;
		b = c;
		System.out.println("After Swapping="+" "+a + " ," + c);

	}

}
