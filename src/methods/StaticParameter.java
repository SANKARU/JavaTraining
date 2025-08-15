package methods;

public class StaticParameter {

	// Paramterized
	public static void sum(int a, int b) {

		int sum = a + b;
		System.out.println(sum);
	}

	public static void display(String n) {

		System.out.println(n);

	}

	public static void main(String[] args) {

		// We can call the method in 2 ways
		// 1)classname.methodname
		// 2)Direct c
		StaticParameter.sum(8, 2);

		display("hello");

	}

}
