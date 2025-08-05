package javaClass;

public class InstancePractice {

	int num = 1;

	public static void main(String[] args) {

		// For object creation we use "new" Keyword
		// Here the second InstancePractice is constructor,constructor name is same as class name
		// CONSTRUCTOR DON'T HAVE RETURN TYPE
		// practice is the object

		InstancePractice practice = new InstancePractice();
		int value = practice.num;

		System.out.println(value);
		
		
	}

}
