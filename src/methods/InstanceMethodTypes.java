package methods;

public class InstanceMethodTypes {
	public void display() {
		System.out.println("Hi");
	}

	public void name(String s) {

		System.out.println(s);
	}

	public static void main(String[] args) {
      
		InstanceMethodTypes name= new InstanceMethodTypes();
		name.display();
		name.name("Gautham");
		
	}

}
