package methods;

public class PrintExampleUsingThis_Program {

	String Name;
	int Roll;

	public PrintExampleUsingThis_Program(String Name, int Roll) {
		//here we use this keyword so we can give same name for the instance variable also else we have to provide a different name
		//this.InstanceVariable=LocalVariable
		this.Name = Name;
		this.Roll = Roll;

	}

	public void display() {

		System.out.println(Name);
		System.out.println(Roll);

	}

	public static void main(String[] args) {
		PrintExampleUsingThis_Program s = new PrintExampleUsingThis_Program("Gautham", 21);
		s.display();
	}

}
