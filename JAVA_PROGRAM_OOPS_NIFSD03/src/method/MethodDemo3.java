package method;

public class MethodDemo3 {

	String getMessage(String s1) {
		String s2 = "Welcome";
		String s3 = s2 + s1;
		return s3;
	}

	public static void main(String... k) {
		MethodDemo3 md = new MethodDemo3();
		String s5 = "abc";
		String s4 = md.getMessage(s5);
		System.out.println(s4);

	}

}
