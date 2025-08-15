package assignment;

public class SwapWithoutTemp_Assignment {

	public static void main(String[] args) {

		int a = 5;
		int b = 1;
		System.out.println(a+" ,"+b);
		
		a=a+b; //6
		b=a-b; //5
		a=a-b; //1
		System.out.println(a+" ,"+b);

	}

}
