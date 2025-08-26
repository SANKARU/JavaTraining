package assignment;

public class Method_Assignment {

	public static void sum(int num1, int num2) {

		int sum = num1 + num2;
		System.out.println(sum);
	}

	public static void product() {

		int num1 = 2;
		float num2 = 3.5f;
		float product = num1 * num2;
		System.out.println(product);

	}

	public static void sumofThreeNumbers() {

		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int sum = num1 + num2 + num3;
		System.out.println(sum);

	}

	public static void main(String[] args) {

		Method_Assignment.sum(5, 2);
		Method_Assignment.product();
		Method_Assignment.sumofThreeNumbers();
	}

}
