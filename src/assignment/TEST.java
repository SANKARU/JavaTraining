package assignment;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[][] = { { 5, 10, 15 }, { 50, 60, 70 } };

		for (int[] row : num) {
			for (int col : row) {

				System.out.print(col+ "\t");
			}
			System.out.println(" ");
		}
		
	}

}
