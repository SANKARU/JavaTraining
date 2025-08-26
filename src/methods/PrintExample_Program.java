package methods;

public class PrintExample_Program {

	String StudentName;
	int StudentRollNo;

	public PrintExample_Program(String Name, int RollNo) {

		StudentName = Name;
		StudentRollNo = RollNo;

	}

	public void display() {

		System.out.println(StudentName);
		System.out.println(StudentRollNo);
	}

	public static void main(String[] args) {
		PrintExample_Program program = new PrintExample_Program("Gautham", 21);
		program.display();

	}

}
