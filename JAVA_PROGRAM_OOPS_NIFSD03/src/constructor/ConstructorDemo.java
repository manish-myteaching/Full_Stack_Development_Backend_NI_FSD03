package constructor;

public class ConstructorDemo  {
	int a;
	String s;
	Student student;

	ConstructorDemo() {
	}
	
	
	ConstructorDemo(int a, String str) {
		this.a = a;
		this.s = str;
	}

	ConstructorDemo(int a, String str, Student student) {
		this.a = a;
		this.s = str;
		this.student = student;
		//System.out.println(this.a + " " + this.s + " " + this.student.rollNo + " " + this.student.name);
	}


	@Override
	public String toString() {
		return "ConstructorDemo [a=" + a + ", s=" + s + ", student=" + student + "]";
	}
	
	

}
