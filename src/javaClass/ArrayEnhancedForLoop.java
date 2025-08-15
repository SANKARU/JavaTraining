package javaClass;

public class ArrayEnhancedForLoop {

	public static void main(String[] args) {
		int a[][] = new int[2][2];
		a[0][0] = 2;
		a[0][1] = 3;
		a[1][0] = 4;
		a[1][1] = 8;

		for (int[] b:a) {

			for (int c:b) {

				System.out.print(c + "\t");

			}
			System.out.println();
		}

	}
}
