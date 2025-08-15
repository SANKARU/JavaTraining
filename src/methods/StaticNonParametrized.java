package methods;

public class StaticNonParametrized {

	public static void sum() {
		// now int a and int b is local variable, since it is inside a method.It is
		// inside the sum block
		// Static is used to restrict the visibility(Non-access specifier)
		int a = 2, b = 6;
		int sum = a + b;
		System.out.println(sum);
	}

	public static void display() {
		String n = "name";
		System.out.println(n);

	}

	public static void main(String[] args) {

		// We can call the method in 2 ways
		// 1)classname.methodname
		// 2)Direct calling method
		StaticNonParametrized.sum();

		display();

	}

}
