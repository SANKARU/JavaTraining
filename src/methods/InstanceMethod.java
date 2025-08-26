package methods;

public class InstanceMethod {
	
	public void display() {
		
		String Name="Gautham";
		System.out.println(Name);
	}
	
	public InstanceMethod() {
		System.out.println("This is the constructor");
	}

	public static void main(String[] args) {
		
		InstanceMethod displaying= new InstanceMethod();
		displaying.display();
		
	}

}
