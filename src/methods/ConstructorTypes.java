package methods;

public class ConstructorTypes {
	
	//parametrized constructor
	public ConstructorTypes(int num, float num1) {
        float sum=num+num1;
        System.out.println(sum);
	}
	
	//non parametrized constructor
	public ConstructorTypes() {
		
		int num1= 2;
		int num2= 3;
		int sum=num1+num2;
		 System.out.println(sum);
	} 

	public static void main(String[] args) {

		ConstructorTypes p=new ConstructorTypes(2,4);
		ConstructorTypes d=new ConstructorTypes();
		
	}

}
