
public class Student {
	String studentName;
	int rollNumber=10;
	int age;
	String phoneNo;
	
	void getStudentDetail() {
		System.out.println("method call");
		System.out.println(studentName +" "+rollNumber+ "  "+phoneNo+"  "+age );
	}
	
	public static void main(String...k) {
		Student student=new Student();
		student.studentName="Manish";
		student.rollNumber=101;
		student.phoneNo="453535353";
		student.age=32;
		
		
		Student student1=new Student();
		student1.studentName="Ramesh";
		student1.rollNumber=102;
		student1.phoneNo="4535355353";
		student1.age=34;
		
		
		Student student3=new Student();
		student3.studentName="Suresh";
		student3.rollNumber=103;
		student3.phoneNo="83535353";
		student3.age=36;		
		
		student.getStudentDetail();
		student1.getStudentDetail();
		student3.getStudentDetail();
		
	}
}
