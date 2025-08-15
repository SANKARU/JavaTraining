package javaClass;

public class ArrayMultiDimensional {

	public static void main(String[] args) {
		
		
		int a[][]= new int[2][2];
		a[0][0]=2;
		a[0][1]=3;
		a[1][0]=4;
		a[1][1]=8;
		
	for(int i=0;i<a.length;i++) {
		
		for(int j=0;j<a[i].length;j++) {
		
			System.out.print(a[i][j]+"\t");
		
		}
		System.out.println();
	}
		
	}

}
